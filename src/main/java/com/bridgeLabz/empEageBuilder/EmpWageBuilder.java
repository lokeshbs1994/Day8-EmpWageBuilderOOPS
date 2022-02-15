package com.bridgeLabz.empEageBuilder;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    int empHrs = 0;
    int empWage = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage builder Using OOPS concepts");
        EmpWageBuilder empWage = new EmpWageBuilder();
        int attendance = empWage.empAttendance();
        empWage.empDailyWages(attendance);
    }

    public int empAttendance() {
        int empCheck = (int)Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_FULL_TIME:
            System.out.println("Employee is Present full-time");
            break;
            case IS_PART_TIME:
            System.out.println("Employee is Present part-time");
            break;
            default:
            System.out.println("Employee is Absent");
        }
        return empCheck;
    }

    public void empDailyWages(int empCheck) {
        switch (empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs =4;
                break;
            default:
                empHrs=0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
    }

}
