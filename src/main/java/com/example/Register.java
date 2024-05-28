package com.example;

import java.util.List;

public class Register {

    public static void main(String[] args) {
        var directReport1 = new DirectReport(1);
        var directReport2 = new DirectReport(2);
        var manager = new Manager(3, List.of(directReport1, directReport2));
        printDirectReports(manager);
    }

    public static void printDirectReports(Employee employee) {
        if (employee instanceof Manager(_, var directReports)) {
            System.out.println("Direct reports: " + directReports);
        } else {
            throw new IllegalArgumentException("Employee is not a manager");
        }
    }

}

