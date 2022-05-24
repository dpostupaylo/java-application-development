package com.acme.dbo.txlog.message;

public class IntMessage implements Message {
    private final String PREFIX = "primitive:";
    private int message;

    public IntMessage(int message) {
        this.message = message;
    }

    @Override
    public String getDecoratedMessage() {
        return String.format("%s %s", this.PREFIX, this.message);
    }
}
