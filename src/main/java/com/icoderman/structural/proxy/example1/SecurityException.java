package com.icoderman.structural.proxy.example1;

public class SecurityException extends RuntimeException {
    public SecurityException(String message, Throwable error) {
        super(message, error);
    }

    public SecurityException(String message) {
        super(message);
    }

    public SecurityException(Throwable error) {
        super(error);
    }
}
