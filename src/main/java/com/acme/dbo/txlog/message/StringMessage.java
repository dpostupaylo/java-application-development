package com.acme.dbo.txlog.message;


public class StringMessage implements Message {
    private final String PREFIX = "string: ";
    private String message;

    public StringMessage(String message) {
        this.message = message;
    }

    @Override
    public String getDecoratedMessage() {
        return String.format("%s %s", this.PREFIX, this.message);
    }
}
