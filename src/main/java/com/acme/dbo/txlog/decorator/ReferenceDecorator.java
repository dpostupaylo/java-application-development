package com.acme.dbo.txlog.decorator;

public class ReferenceDecorator implements Decorator{
    private final String prefix = "reference: ";

    @Override
    public String decorateMessage(String message) {
        return prefix + message;
    }
}
