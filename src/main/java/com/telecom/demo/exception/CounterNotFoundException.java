package com.telecom.demo.exception;

public class CounterNotFoundException extends RuntimeException {
    public CounterNotFoundException(){}

    public CounterNotFoundException(String message) {
        super(message);
    }

    public CounterNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CounterNotFoundException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" - "+getMessage();
    }
}
