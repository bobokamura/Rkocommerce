package com.bobokamura.rkocommerce.services.exceptions;

public class DatabaseException extends RuntimeException{

    public DatabaseException(Long id) {
        super("The id " + id + " cannot be exclude. Data integrity violation");
    }
}
