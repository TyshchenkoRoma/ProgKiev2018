package com.company;

public class IncorrectLineException extends Exception {
    public IncorrectLineException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return  " Line is incorrect!!!!! " + super.getMessage();
    }
}
