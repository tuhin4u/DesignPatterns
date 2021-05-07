package com.designpatterns.Proxy;

public class AuthenticatioFailedException extends Exception{
    public AuthenticatioFailedException(String message) {
        super(message);
    }

    public AuthenticatioFailedException() {
        super("Authentication Failed----------");
    }
}
