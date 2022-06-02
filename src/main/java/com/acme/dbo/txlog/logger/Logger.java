package com.acme.dbo.txlog.logger;

import com.acme.dbo.txlog.exception.SaveException;

public interface Logger {
    void log(String message) throws SaveException;
}
