package com.example;

public class App {

    public String getLoggerType(Logger logger) {
        if (logger instanceof FileLogger fileLogger) {
            System.out.println("Logger type is file");
            return fileLogger.getLoggerType();
        } else if (logger instanceof ConsoleLogger consoleLogger) {
            System.out.println("Logger type is console");
            return consoleLogger.getLoggerType();
        } else {
            throw new IllegalArgumentException("Logger type not supported");
        }

    }

}
