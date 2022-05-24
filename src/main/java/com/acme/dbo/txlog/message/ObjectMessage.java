package com.acme.dbo.txlog.message;

import com.acme.dbo.txlog.decorator.Decorator;
import com.acme.dbo.txlog.decorator.ReferenceDecorator;

public class ObjectMessage implements Message {
    private Object message;
    private final Decorator decorator;

    public ObjectMessage(Object message) {
        this.message = message;
        this.decorator = new ReferenceDecorator();
    }

    @Override
    public String getDecoratedMessage() {
        return decorator.decorateMessage(this.message.toString());
    }
}
