package com.bridgeLabz.empEageBuilder;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;
    int empHrs = 0;
    int empWage = 0;
    int totalEmpWage=0;
    int totalWorkingDays=0;
    int totalEmpHrs=0;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage builder Using OOPS concepts");
        EmpWageBuilder empWage = new EmpWageBuilder();
        empWage.empAttendance();
        System.out.println("================");
        empWage.empDailyWages(empWage.empAttendance());
        System.out.println("==================");
        empWage.empMonthWage();
        System.out.println("==================");
        empWage.empWageCondition();
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

    public void empMonthWage() {
        for (int day = 1; day <=  NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int)Math.floor(Math.random()*10)%3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Day"+day+" Emp Wage: " + empWage);
        }
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }

    public void empWageCondition() {
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day# " + totalWorkingDays + " Emp hrs: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}
