package com.acme.dbo.txlog;

import com.acme.dbo.txlog.logger.Logger;
import com.acme.dbo.txlog.message.Message;

public class LogService {
    private Logger logger;

    public LogService(Logger logger){
        this.logger = logger;
    }

    public void log(Message message){
        logger.log(message);
    }
}
