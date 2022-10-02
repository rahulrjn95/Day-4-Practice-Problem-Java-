package com.bridgelabz;

//  Calculating Wages for a Month
//  Assume 20 Working Day per Month


public class Uc5WagesForMonth {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int empRatePerHr = 20;
    public static final int noOfWorkingDays = 20;
    public static void main(String[] args){
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        for (int day = 0;day < noOfWorkingDays;day++){
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case isFullTime:
                    empHrs = 8;
                    break;
                case isPartTime:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * empRatePerHr;
            totalEmpWage += empWage;
            System.out.println("Emp Wage:" + empWage);
        }
        System.out.println("Total Emp Wage:" +totalEmpWage);
    }
}
