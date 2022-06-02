package com.acme.dbo.txlog.logger;

import com.acme.dbo.txlog.exception.SaveException;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) throws SaveException {
        try {
            System.out.println(message);
        } catch (Exception exception){
            throw new SaveException("Can't save or write " + exception.getMessage() );
        }
    }
}
