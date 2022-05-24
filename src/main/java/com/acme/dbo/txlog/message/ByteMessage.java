package com.acme.dbo.txlog.message;

import com.acme.dbo.txlog.decorator.Decorator;
import com.acme.dbo.txlog.decorator.PrimitiveDecorator;

public class ByteMessage implements Message{
    private byte message;
    private Decorator decorator;

    public ByteMessage(byte message){
        this.message = message;
        this.decorator = new PrimitiveDecorator();
    }

    @Override
    public String getDecoratedMessage(){
        return decorator.decorateMessage(Byte.toString(this.message));
    }
}
