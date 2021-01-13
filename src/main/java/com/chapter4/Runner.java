package com.chapter4;

public class Runner {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Hypothetical", "Employee");
        emp1.countYearsFrom();
        emp1.countDaysTillSalary();
        Employee emp2 = new Employee("Nadiia", "H", "1986-04-24", "2017-01-09");
        emp2.countYearsFrom();
        Employee emp3;
        emp3 = Employee.readNewEmployee();
        emp3.countYearsFrom();
        emp3.countDaysTillSalary();
    }
}
