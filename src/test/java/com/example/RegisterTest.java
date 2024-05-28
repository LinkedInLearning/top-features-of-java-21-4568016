package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegisterTest {

    @Test
    void testPrintDirectReports() {
        var directReport1 = new DirectReport(1);
        var directReport2 = new DirectReport(2);
        var manager = new Manager(3, List.of(directReport1, directReport2));
        var register = new Register();
        var directReports = register.printDirectReports(manager);
        assertEquals(List.of(directReport1, directReport2), directReports);
    }

}
