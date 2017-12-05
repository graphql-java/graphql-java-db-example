package com.graphql.example.db;

import com.graphql.example.db.data.DatabaseAccess;
import graphql.language.Field;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.dataloader.DataLoaderRegistry;
import org.jooq.Record;

import java.util.ArrayList;
import java.util.List;

/**
 * This is our wiring used to put behaviour to a graphql type.
 */
class AppWiring {

    static DataFetcher customersFetcher = env -> {
        Context ctx = env.getContext();

        Integer custId = toInteger((env.getArgument("custId")));

        FieldSubSelection fieldSubSelection = new FieldSubSelection(env.getSelectionSet());

        return ctx.db().getCustomers(custId,
                fieldSubSelection.containsField("invoices"),
                fieldSubSelection.containsField("invoices.*"));
    };

    /**
     * This example code uses JOOQ Records to hold SQL retrieved data.  We need a way
     * to read a record and return attributes from it
     */
    static DataFetcher jooqRecordFetcher = env -> {
        Record record = env.getSource();
        if (record == null) {
            return null;
        }

        Field field = env.getFields().get(0);

        String name = capitalize(field.getName());
        return record.get(name);
    };

    //
    // This returns the sub selection of fields from a graphql query
    //
    // So the following query at customers
    //
    // customers {
    //    firstName
    //    lastName
    //    company
    //    invoices {
    //        invoiceDate
    //    }
    // }
    //
    // would return [firstName,lastName,company,invoices)
    private static List<String> getFieldSelection(DataFetchingEnvironment env) {
        return new ArrayList<>(env.getSelectionSet().get().keySet());
    }

    private static String capitalize(String fieldName) {
        //
        // The database has capital letters as field names while the graphql schema
        // has camel case.  We could have made this the same, but we chose to do this to
        // demonstrate some of the concerns that can happen in graphql systems
        // ie name mismatching and information hiding
        //
        return Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
    }

    private static Integer toInteger(Object obj) {
        return obj == null ? null : Integer.parseInt(obj.toString());
    }

    /**
     * The context object is passed to each level of a graphql query and in this case it contains
     * the data loader registry.  This allows us to keep our data loaders per request since
     * they cache data and cross request caches are often not what you want.
     */
    public static class Context {

        final DataLoaderRegistry dataLoaderRegistry;
        final DatabaseAccess db;

        public Context() {
            this.db = new DatabaseAccess();
            this.dataLoaderRegistry = new DataLoaderRegistry();
        }

        public DataLoaderRegistry getDataLoaderRegistry() {
            return dataLoaderRegistry;
        }

        public DatabaseAccess db() {
            return db;
        }
    }
}
