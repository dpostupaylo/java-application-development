package com.acme.dbo.txlog.message;

import com.acme.dbo.txlog.decorator.CharDecorator;
import com.acme.dbo.txlog.decorator.Decorator;

public class CharMessage implements Message{
    private char message;
    private Decorator decorator;

    public CharMessage(char message){
        this.message = message;
        this.decorator = new CharDecorator();
    }

    @Override
    public String getDecoratedMessage(){
        return this.decorator.decorateMessage(Character.toString(this.message));
    }
}
