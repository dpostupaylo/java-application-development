package com.acme.dbo.txlog.message;


public class BooleanMessage extends MessageDecorator implements Message{
    private boolean message;

    public BooleanMessage(boolean message){
        super("primitive:");
        this.message = message;
    }

    @Override
    public void aggregate(Message message) {

    }

    @Override
    public String getDecoratedMessage(){
        return this.decorateMessage(Boolean.toString(this.message));
    }

    @Override
    public boolean equals(Object o){
        if (o == null || this.getClass() != o.getClass())
            return false;

        BooleanMessage compareMessage = (BooleanMessage) o;

        if (!(this.message == compareMessage.message))
            return false;

        return true;
    }
}
