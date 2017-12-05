package com.graphql.example.db.data;

import com.graphql.example.db.data.tables.records.CustomersRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.impl.DSL;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.graphql.example.db.data.Tables.CUSTOMERS;
import static com.graphql.example.db.data.Tables.INVOICES;

public class DatabaseAccess {

    static final File DB_FILE = new File("src/main/resources/chinook.db");
    static final String DB_URL = "jdbc:sqlite:" + DB_FILE.getAbsolutePath();

    public static void main(String[] args) throws Exception {

        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            DSLContext ctx = DSL.using(conn, SQLDialect.SQLITE);
            Result<CustomersRecord> result = ctx.selectFrom(CUSTOMERS).fetch();
            for (CustomersRecord customer : result) {
                System.out.println(customer.getFirstname() + " " + customer.getLastname());
            }
        }
    }

    public Result<Record> getCustomers(Integer custId, boolean includeInvoices, boolean includeInvoiceItems) {
        try (Connection conn = connection()) {
            DSLContext jooq = jooq(conn);
            Select<Record> sql;
            if (custId != null) {
                sql = jooq.select().from(CUSTOMERS.join(INVOICES).on(INVOICES.CUSTOMERID.eq(CUSTOMERS.CUSTOMERID))).where(
                        CUSTOMERS.CUSTOMERID.eq(custId)
                );
            } else {
                sql = jooq.select().from(CUSTOMERS.join(INVOICES).on(INVOICES.CUSTOMERID.eq(CUSTOMERS.CUSTOMERID)));
            }
            return sql.fetch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    Connection connection() {
        try {
            return DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    DSLContext jooq(Connection connection) {
        return DSL.using(connection, SQLDialect.SQLITE);
    }
}