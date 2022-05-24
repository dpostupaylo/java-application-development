package com.acme.dbo.txlog.message;

public class ObjectMessage implements Message {
    private final String PREFIX = "reference: ";
    private Object message;

    public ObjectMessage(Object message) {
        this.message = message;
    }

    @Override
    public String getDecoratedMessage() {
        return String.format("%s %s", this.PREFIX, this.message.toString());
    }
}
