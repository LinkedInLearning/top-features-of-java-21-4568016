package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testFileLogger() {
        App app = new App();
        Logger logger = new FileLogger();

        String result = app.getLoggerType(logger);

        assertEquals("File", result);
    }

    @Test
    void testConsoleLogger() {
        App app = new App();
        Logger logger = new ConsoleLogger();

        String result = app.getLoggerType(logger);

        assertEquals("Console", result);
    }

}
