package com.acme.dbo.txlog.message;

public class MessageDecorator {
    private final String PREFIX;

    public MessageDecorator(String prefix){
        this.PREFIX = prefix;
    }

    public String decorateMessage(String message){
        return String.format("%s %s", PREFIX, message);
    }
}
