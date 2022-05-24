package com.acme.dbo.txlog.message;

import com.acme.dbo.txlog.decorator.Decorator;
import com.acme.dbo.txlog.decorator.PrimitiveDecorator;

public class IntMessage implements Message {
    private int message;
    private final Decorator decorator;

    public IntMessage(int message) {
        this.message = message;
        this.decorator = new PrimitiveDecorator();
    }

    @Override
    public String getDecoratedMessage() {
        return decorator.decorateMessage(Integer.toString(this.message));
    }
}
