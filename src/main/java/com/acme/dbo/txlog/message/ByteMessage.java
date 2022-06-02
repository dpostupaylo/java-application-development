package com.acme.dbo.txlog.message;


public class ByteMessage extends MessageDecorator  implements Message{
    private byte message;

    public ByteMessage(byte message){
        super("primitive:");
        this.message = message;
    }

    @Override
    public void aggregate(Message message) {

    }
    @Override
    public String getDecoratedMessage(){
        return super.decorateMessage(Byte.toString(this.message));
    }

    @Override
    public boolean equals(Object o){
        if (o == null || this.getClass() != o.getClass())
            return false;
        ByteMessage compareMessage = (ByteMessage) o;

        if (!(this.message == compareMessage.message))
            return false;

        return true;
    }
}
