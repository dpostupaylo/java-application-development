package com.acme.dbo.txlog.message;


public class BooleanMessage implements Message{
    private final String PREFIX = "primitive: ";
    private boolean message;

    public BooleanMessage(boolean message){
        this.message = message;
    }

    @Override
    public String getDecoratedMessage(){
        return String.format("%s %s", this.PREFIX, this.message);
    }
}
