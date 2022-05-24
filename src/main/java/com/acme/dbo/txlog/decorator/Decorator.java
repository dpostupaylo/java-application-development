package com.acme.dbo.txlog.decorator;

import com.acme.dbo.txlog.message.Message;

public interface Decorator {
    String decorateMessage(String message);
}
