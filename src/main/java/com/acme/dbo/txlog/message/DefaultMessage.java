package com.acme.dbo.txlog.message;

public class DefaultMessage implements Message{
    @Override
    public String getDecoratedMessage() {
        return null;
    }

    @Override
    public void aggregate(Message message) {

    }

    @Override
    public boolean equals(Object o){
        return false;
    }
}
