package com.acme.dbo.txlog.decorator;

public class PrimitiveDecorator implements Decorator {
    private final String prefix = "primitive: ";

    @Override
    public String decorateMessage(String message){
        return prefix + message;
    }
}
