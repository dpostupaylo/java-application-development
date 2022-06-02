package com.acme.dbo.txlog.exception;

public class NullLogMessageException extends LogException {
    public NullLogMessageException(String message){
        super(message);
    }
}
