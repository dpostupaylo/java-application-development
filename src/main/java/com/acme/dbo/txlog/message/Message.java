package com.acme.dbo.txlog.message;

import com.acme.dbo.txlog.decorator.Decorator;

public interface Message {
    String getDecoratedMessage();
}
