package com.acme.dbo.txlog;

import com.acme.dbo.txlog.exception.LogException;
import com.acme.dbo.txlog.message.*;
import com.acme.dbo.txlog.logger.ConsoleLogger;

public class Facade {
    static LogService logService = new LogService(new ConsoleLogger());

    public static void log(int message) {
        try {
            logService.log(new IntMessage(message));
        } catch (LogException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void log(byte message) {
        try {
            logService.log(new ByteMessage(message));
        } catch (LogException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void log(char message) {
        try {
            logService.log(new CharMessage(message));
        } catch (LogException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void log(String message) {
        try {
            logService.log(new StringMessage(message));
        } catch (LogException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void log(boolean message) {
        try {
            logService.log(new BooleanMessage(message));
        } catch (LogException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void log(Object message) {
        try {
            logService.log(new ObjectMessage(message));
        } catch (LogException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
