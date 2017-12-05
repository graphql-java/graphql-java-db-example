package com.graphql.example.db;

import graphql.language.Field;
import graphql.language.Selection;
import graphql.schema.DataFetchingFieldSelectionSet;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FieldSubSelection {

    private final static String SEP = FileSystems.getDefault().getSeparator();

    private final Set<String> flattenedFields;

    public FieldSubSelection(DataFetchingFieldSelectionSet selectionSet) {
        flattenedFields = new LinkedHashSet<>();
        Map<String, List<Field>> fieldMap = selectionSet.get();
        for (List<Field> fields : fieldMap.values()) {
            traverseFields(fields, "");
        }
    }

    private void traverseFields(List<Field> fieldList, String parentField) {
        for (Field field : fieldList) {
            String fieldName = (!parentField.isEmpty() ? parentField + SEP : "") + field.getName();
            flattenedFields.add(fieldName);
            if (field.getSelectionSet() != null) {
                List<Selection> selections = field.getSelectionSet().getSelections();
                if (selections != null) {
                    List<Field> subFields = selections.stream()
                            .filter(s -> s instanceof Field)
                            .map(f -> (Field) f)
                            .collect(Collectors.toList());

                    traverseFields(subFields, fieldName);
                }
            }
        }
    }

    public boolean containsField(String fieldAddress) {
        if (fieldAddress == null || fieldAddress.isEmpty()) {
            return false;
        }
        fieldAddress = fieldAddress.replace(".", SEP);
        PathMatcher globMatcher = FileSystems.getDefault().getPathMatcher("glob:" + fieldAddress);
        for (String flattenedField : flattenedFields) {
            if (flattenedField.equals(fieldAddress)) {
                return true;
            }
            Path path = Paths.get(flattenedField);
            if (globMatcher.matches(path)) {
                return true;
            }
        }
        return false;
    }
}
