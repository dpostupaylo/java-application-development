package com.acme.dbo.txlog.printer;

import com.acme.dbo.txlog.message.Message;

public interface Logger {
    void log(Message message);
}
