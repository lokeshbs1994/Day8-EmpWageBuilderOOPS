package com.bridgeLabz.empEageBuilder;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    int empHrs = 0;
    int empWage = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage builder Using OOPS concepts");
        EmpWageBuilder empWage = new EmpWageBuilder();
        double a = empWage.empAttendance();
        empWage.empDailyWages(a);
    }

    public double empAttendance() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        return empCheck;
    }

    public void empDailyWages(double empCheck) {
        if (empCheck == IS_FULL_TIME)
            empHrs = 8;

        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
    }

}
