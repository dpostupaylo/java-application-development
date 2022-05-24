package com.acme.dbo.txlog.decorator;

public class StringDecorator implements Decorator{
    private final String prefix = "string: ";
    @Override
    public String decorateMessage(String message) {
        return prefix + message;
    }
}
