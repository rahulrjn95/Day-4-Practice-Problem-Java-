package com.bridgelabz;

//  Calculate Daily Employee Wage
//  Assume Wage Per Hour = 20
//  Assume Full Day Hour = 8

public class Uc2DailyWage {
    public static void main(String [] args){

        // Constants
        int iSFullTime = 1;
        int empRatePerHr = 20;

        //Variables
        int empHrs = 0;
        int empWage = 0;

        //computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck ==  iSFullTime)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * empRatePerHr;
        System.out.println("Employee Wage is:" +empWage);
    }
}
