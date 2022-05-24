package com.acme.dbo.txlog.message;


public class CharMessage implements Message{
    private final String PREFIX = "char: ";
    private char message;

    public CharMessage(char message){
        this.message = message;
    }

    @Override
    public String getDecoratedMessage(){
        return String.format("%s %c", this.PREFIX, this.message);
    }
}
