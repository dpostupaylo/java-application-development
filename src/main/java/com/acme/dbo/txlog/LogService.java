package com.acme.dbo.txlog;

import com.acme.dbo.txlog.exception.LogException;
import com.acme.dbo.txlog.exception.NullLogMessageException;
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

    public void log(Message message) throws LogException {
        if (message == null) throw new NullLogMessageException("Income message in null");

        if (currentMessage.equals(message))
            currentMessage.aggregate(message);
        else {
            currentMessage = message;
        }

        logger.log(currentMessage.getDecoratedMessage());
    }
}
