package com.acme.dbo.txlog.message;

public class IntMessage extends MessageDecorator implements Message {
    private int message;

    public IntMessage(int message) {
        super("primitive:");
        this.message = message;
    }

    @Override
    public String getDecoratedMessage() {
        return super.decorateMessage(Integer.toString(this.message));
    }

    @Override
    public void aggregate(Message message) {
        this.message += ((IntMessage)message).message;
    }

    @Override
    public boolean equals(Object o){
        if (o == null || this.getClass() != o.getClass())
            return false;

        return true;
    }
}
