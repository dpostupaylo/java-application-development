package com.acme.dbo.txlog.message;

public class IntMessage implements Message{
    private int message;

    public IntMessage(int message){
        this.message = message;
    }

    @Override
    public String getDecoratedMessage(){
        return String.format("primitive: %s", this.message);
    }
}
