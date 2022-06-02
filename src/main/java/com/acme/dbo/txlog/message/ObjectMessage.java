package com.acme.dbo.txlog.message;

public class ObjectMessage extends MessageDecorator implements Message {
    private Object message;

    public ObjectMessage(Object message) {
        super("reference:");
        this.message = message;
    }

    @Override
    public String getDecoratedMessage() {
        return super.decorateMessage(this.message.toString());
    }

    @Override
    public void aggregate(Message message) {

    }

    @Override
    public boolean equals(Object o){
        if (o == null || this.getClass() != o.getClass())
            return false;

        ObjectMessage compareMessage = (ObjectMessage) o;

        if (!this.message.equals(compareMessage.message))
            return false;

        return true;
    }
}
