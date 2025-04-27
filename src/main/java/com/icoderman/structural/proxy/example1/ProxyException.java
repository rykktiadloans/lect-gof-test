package com.icoderman.structural.proxy.example1;

public class ProxyException extends RuntimeException {
    public ProxyException(String message, Throwable error) {
        super(message, error);
    }

    public ProxyException(String message) {
        super(message);
    }

    public ProxyException(Throwable error) {
        super(error);
    }
}
