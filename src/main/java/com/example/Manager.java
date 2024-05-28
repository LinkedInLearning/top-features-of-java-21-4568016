package com.example;

import java.util.List;

public record Manager(int id, List<DirectReport> directReports)
        implements Employee {
}
