package com.acme.dbo.txlog.printer;

import com.acme.dbo.txlog.message.Message;

public class ConsoleLogger implements Logger {

    @Override
    public void log(Message message) {
        System.out.println(message.getDecoratedMessage());
    }
}
