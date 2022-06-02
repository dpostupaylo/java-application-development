package com.acme.dbo.txlog;

import com.acme.dbo.txlog.logger.Logger;
import com.acme.dbo.txlog.message.DefaultMessage;
import com.acme.dbo.txlog.message.Message;

public class LogService {
    private Message currentMessage;
    private Logger logger;

    public LogService(Logger logger) {
        this.logger = logger;
        currentMessage = new DefaultMessage();
    }

    public void log(Message message) {
        if (currentMessage.equals(message))
            currentMessage.aggregate(message);
        else {
            logger.log(message.getDecoratedMessage());
        }
    }
}
