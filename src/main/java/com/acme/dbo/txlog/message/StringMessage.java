package com.acme.dbo.txlog.message;

public class StringMessage implements Message{
    private String message;

    public StringMessage(String message){
        this.message = message;
    }

    @Override
    public String getDecoratedMessage(){
        return String.format("string: %s", this.message);
    }
}
