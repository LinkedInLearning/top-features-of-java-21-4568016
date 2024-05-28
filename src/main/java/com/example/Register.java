package com.example;

import java.util.List;

public class Register {

    public List<DirectReport> printDirectReports(Employee employee) {
        if (employee instanceof Manager manager) {
            var directReports = manager.directReports();
            System.out.println("Direct reprots: " + directReports);
            return directReports;
        } else {
            throw new IllegalArgumentException("Employee is not a manager");
        }
    }

}
