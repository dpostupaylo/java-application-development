package com.acme.dbo.txlog;

import com.acme.dbo.txlog.message.IntMessage;
import com.acme.dbo.txlog.message.StringMessage;
import com.acme.dbo.txlog.printer.ConsoleLogger;
import com.acme.dbo.txlog.printer.Logger;

public class Facade {
    static Logger consoleLogger = new ConsoleLogger();

    public static void log(int message) {
        consoleLogger.log(new IntMessage(message));
    }

    public static void log(byte message) {
    }

    public static void log(char message) {
    }

    public static void log(String message) {
        consoleLogger.log(new StringMessage(message));
    }

    public static void log(boolean message) {
    }

    public static void log(Object message) {
    }
}
