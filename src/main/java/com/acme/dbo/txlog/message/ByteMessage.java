package com.acme.dbo.txlog.message;


public class ByteMessage implements Message{
    private final String PREFIX = "primitive: ";
    private byte message;

    public ByteMessage(byte message){
        this.message = message;
    }

    @Override
    public String getDecoratedMessage(){
        return String.format("%s %s", this.PREFIX, this.message);
    }
}
