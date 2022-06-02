package com.acme.dbo.txlog.logger;

import com.acme.dbo.txlog.message.Message;

public interface Logger {
    void log(String message);
}
