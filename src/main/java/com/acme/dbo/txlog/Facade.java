package com.acme.dbo.txlog;

public class Facade {
    private static int currentInt = 0;
    private static byte currentByte = 0;
    private static String currentString = "";

    private static int countString = 0;
    private static Object previousMessage = new Object();

    public static void log(int message) {
        if (previousMessage.getClass() != int.class) {
            flush();
            previousMessage = message;
        }

        currentInt += message;
    }

    public static void log(byte message) {
        if (previousMessage.getClass() != byte.class) {
            flush();
            previousMessage = message;
        }

        currentByte += message;
    }

    public static void log(char message) {
        MessagePrinter.printMessage(MessageDecorator.decorate(message));
    }

    public static void log(String message) {
        if (previousMessage.getClass() != String.class) {
            flush();
            previousMessage = message;
        }

        if (currentString.equals(message) || countString == 0) {
            countString += 1;
            currentString = message;
        } else {
            flush();
        }
    }

    public static void log(boolean message) {
        MessagePrinter.printMessage(MessageDecorator.decorate(message));
    }

    public static void log(Object message) {
        MessagePrinter.printMessage(MessageDecorator.decorate(message));
    }

    public static void flush() {
        if (currentInt > 0)
            MessagePrinter.printMessage(MessageDecorator.decorate(currentInt));
        if (currentByte > 0)
            MessagePrinter.printMessage(MessageDecorator.decorate(currentByte));
        if (!currentString.equals("") && countString != 0) {
            MessagePrinter.printMessage(MessageDecorator.decorate(currentString));
        }
        countString = 0;
        currentInt = 0;
        currentByte = 0;
        currentString = "";
    }
}
