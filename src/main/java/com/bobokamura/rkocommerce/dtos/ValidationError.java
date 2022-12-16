package com.bobokamura.rkocommerce.dtos;

import com.bobokamura.rkocommerce.services.exceptions.CustomError;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {
    private final List<FieldMessage> errors = new ArrayList<>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
}
