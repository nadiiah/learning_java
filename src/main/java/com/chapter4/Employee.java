package com.chapter4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthDate = LocalDate.ofEpochDay(0);
    private final LocalDate hiringDate;
    private LocalDate nearestSalaryDate;
    private static int employeeId = 0;
    private static final LocalDate now = LocalDate.now();

    public Employee(String first, String last) {
        firstName = first;
        lastName = last;
        hiringDate = now;
        employeeId++;
        System.out.printf("Employee #%s: %s, %s, %s, %s.\n", employeeId, firstName, lastName, birthDate.toString(), hiringDate.toString());
    }

    public Employee(String first, String last, String birth) {
        firstName = first;
        lastName = last;
        birthDate = LocalDate.parse(birth);
        hiringDate = now;
        employeeId++;
        System.out.printf("Employee #%s: %s, %s, %s, %s.\n", employeeId, firstName, lastName, birthDate.toString(), hiringDate.toString());
    }

    public Employee(String first, String last, String birth, String hiring) {
        firstName = first;
        lastName = last;
        birthDate = LocalDate.parse(birth);
        hiringDate = LocalDate.parse(hiring);
        employeeId++;
        System.out.printf("Employee #%s: %s, %s, %s, %s.\n", employeeId, firstName, lastName, birthDate.toString(), hiringDate.toString());
    }

    public static Employee readNewEmployee() {
        String birth = LocalDate.ofEpochDay(0).toString();
        String hiring = "";
        System.out.println("Please fill in a new employee data:");
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String last = input.nextLine();
        if (input.hasNextLine() && input.nextLine().length() > 0) {
            birth = input.nextLine();
            return new Employee(first, last, birth);
        } else {
            hiring = input.nextLine();
            return new Employee(first, last, birth, hiring);
        }
    }

    public void countYearsFrom() {
        int age = Period.between(birthDate, now).getYears();
        int yearsOnWork = Period.between(hiringDate, now).getYears();
        System.out.printf("Employee age is %s.\n", age);
        System.out.printf("Employee has been working for the company for %s years.\n", yearsOnWork);
    }

    public void countDaysTillSalary() {
        nearestSalaryDate = now.withDayOfMonth(11).plusMonths(1);
        System.out.printf("Next salary will come on %s.\n", nearestSalaryDate);
    }
}
