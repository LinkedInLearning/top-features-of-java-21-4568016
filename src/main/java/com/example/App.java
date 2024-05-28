package com.example;

public class App {

    public String getLoggerType(Logger logger) {
        switch (logger) {
            case FileLogger fileLogger -> {
                System.out.println("Logger type is file");
                return fileLogger.getLoggerType();
            }
            case ConsoleLogger consoleLogger -> {
                System.out.println("Logger type is cloud console");
                return consoleLogger.getLoggerType();
            }
            default -> throw new IllegalArgumentException("Logger type not supported");
        }


    }

}
