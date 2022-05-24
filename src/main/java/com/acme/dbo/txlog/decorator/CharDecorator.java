package com.acme.dbo.txlog.decorator;

public class CharDecorator implements Decorator{
    private final String prefix = "char: ";
    @Override
    public String decorateMessage(String message) {
        return prefix + message;
    }
}
