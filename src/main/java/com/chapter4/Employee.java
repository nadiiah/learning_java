package com.chapter4;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthDate = LocalDate.ofEpochDay(0);
    private final LocalDate hiringDate;
    private static LocalDate nearestSalaryDate;
    private static int employeeId = 0;
    public static final int DAY_OF_SALARY = 11;
    private static final LocalDate now = LocalDate.now();

    public Employee(String first, String last) {
        firstName = first;
        lastName = last;
        hiringDate = now;
        employeeId++;
        printEmployeeData();
    }

    public Employee(String first, String last, LocalDate birth) {
        firstName = first;
        lastName = last;
        birthDate = birth;
        hiringDate = now;
        employeeId++;
        printEmployeeData();
    }

    public Employee(String first, String last, LocalDate birth, LocalDate hiring) {
        firstName = first;
        lastName = last;
        birthDate = birth;
        hiringDate = hiring;
        employeeId++;
        printEmployeeData();
    }

    public void printEmployeeData() {
        System.out.printf("Employee #%s: %s, %s, %s, %s.\n", employeeId, firstName, lastName, birthDate.toString(), hiringDate.toString());
    }

    private int countYearsFromBirthday() {
        return Period.between(birthDate, now).getYears();
    }

    private int countYearsFromHiringDate() {
        int yearsOnWork;
        if ((now.getDayOfMonth() >= hiringDate.getDayOfMonth()) && (now.getMonthValue() >= hiringDate.getMonthValue())) {
            yearsOnWork = now.getYear() - hiringDate.getYear();
        } else if (now.getYear() == hiringDate.getYear()) {
            yearsOnWork = 0;
        } else {
            yearsOnWork = now.getYear() - hiringDate.getYear() - 1;
        }
        return yearsOnWork;
    }

    private static int countDaysTillSalary() {
        nearestSalaryDate = now.withDayOfMonth(DAY_OF_SALARY).plusMonths(1);
        return Period.between(now, nearestSalaryDate).getDays();
    }

    public void printResults() {
        System.out.printf("Employee age is %d.\n", countYearsFromBirthday());
        System.out.printf("Employee has been working for the company for %s years.\n", countYearsFromHiringDate());
    }

    public static void printDaysTillSalary(){
        System.out.printf("Next salary will come in %s days.\n", countDaysTillSalary());
    }
}
