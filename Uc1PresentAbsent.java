package com.bridgelabz;

// Check Employee is Present or Absent
// Use ((RANDOM)) for Attendance Check

public class Uc1PresentAbsent {
    public static void main(String[] args){
        double random = Math.random();
        System.out.println(random);
        if(random>0.5) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }

}
