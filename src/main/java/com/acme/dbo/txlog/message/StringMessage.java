package com.acme.dbo.txlog.message;


public class StringMessage extends MessageDecorator implements Message {
    private String message;
    private int count = 1;

    public StringMessage(String message) {
        super("string:");
        this.message = message;
    }

    @Override
    public String getDecoratedMessage() {
        return super.decorateMessage(String.format("%s (x%d)", this.message, this.count));
    }

    @Override
    public void aggregate(Message message) {
        this.count += 1;
    }

    @Override
    public boolean equals(Object o){
        if (o == null || this.getClass() != o.getClass())
            return false;
        StringMessage compareMessage = (StringMessage) o;

        if (!this.message.equals(compareMessage.message))
            return false;

        return true;
    }
}
