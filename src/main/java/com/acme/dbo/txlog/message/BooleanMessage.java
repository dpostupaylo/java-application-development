package com.acme.dbo.txlog.message;

import com.acme.dbo.txlog.decorator.Decorator;
import com.acme.dbo.txlog.decorator.PrimitiveDecorator;

public class BooleanMessage implements Message{
    private boolean message;
    private Decorator decorator;

    public BooleanMessage(boolean message){
        this.message = message;
        this.decorator = new PrimitiveDecorator();
    }

    @Override
    public String getDecoratedMessage(){
        return decorator.decorateMessage(Boolean.toString(this.message));
    }
}
