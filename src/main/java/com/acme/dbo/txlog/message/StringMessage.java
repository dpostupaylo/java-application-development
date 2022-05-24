package com.acme.dbo.txlog.message;

import com.acme.dbo.txlog.decorator.Decorator;
import com.acme.dbo.txlog.decorator.StringDecorator;

public class StringMessage implements Message {
    private String message;
    private final Decorator decorator;

    public StringMessage(String message) {
        this.message = message;
        this.decorator = new StringDecorator();
    }

    @Override
    public String getDecoratedMessage() {
        return decorator.decorateMessage(this.message);
    }
}
