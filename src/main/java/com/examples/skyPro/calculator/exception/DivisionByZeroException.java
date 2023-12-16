package com.examples.skyPro.calculator.exception;

public class DivisionByZeroException extends IllegalArgumentException{
    public DivisionByZeroException(String message) {
        super(message);
    }
}
