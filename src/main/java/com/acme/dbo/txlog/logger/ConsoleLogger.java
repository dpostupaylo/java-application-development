package com.acme.dbo.txlog.logger;

import com.acme.dbo.txlog.decorator.Decorator;
import com.acme.dbo.txlog.message.Message;

public class ConsoleLogger implements Logger {
    @Override
    public void log(Message message) {
        System.out.println(message.getDecoratedMessage());
    }
}
