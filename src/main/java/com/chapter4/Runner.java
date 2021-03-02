package com.chapter4;

import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Hypothetical", "Employee");
        emp1.printResults();
        Employee emp2 = new Employee("Nadiia", "H", LocalDate.parse("1986-04-24"), LocalDate.parse("2017-01-09"));
        emp2.printResults();
        Employee.printDaysTillSalary();
    }
}
