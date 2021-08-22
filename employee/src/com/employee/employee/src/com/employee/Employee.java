package com.employee;

import java.util.Random;

public class Employee {

	int FullDayHour = 8;
	int WagePerHour = 20;
	int DailyWage = FullDayHour * WagePerHour;

	
        public static void main(String[] args) {

                System.out.println("Welcome to Employee Wage Computation Program");
                
                if (isEmployeePresent()) {
        			System.out.println("Employee is present");
        		} else {
        			System.out.println("Employee is absent");
        		}
                
        }



        public static boolean isEmployeePresent() {
        	   Random rd = new Random();
        	   return rd.nextBoolean();
        }
        
        
}


