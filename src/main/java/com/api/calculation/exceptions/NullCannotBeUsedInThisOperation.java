package com.api.calculation.exceptions;

public class NullCannotBeUsedInThisOperation extends RuntimeException {

    public NullCannotBeUsedInThisOperation(String message) {
        super(message);
    }
}
