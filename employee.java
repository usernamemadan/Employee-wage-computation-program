package com.employee;

import java.util.Random;

public class Employee {

	int FullDayHour = 8;
	int WagePerHour = 20;
	int DailyWage = FullDayHour * WagePerHour;
	int WageforPartTimeWorking = 8;
	static int isPresent=isPresent();

	
        public static void main(String[] args) {

                System.out.println("Welcome to Employee Wage Computation Program");
                
                if (isEmployeePresent()) {
        			System.out.println("Employee is present");
        			isPresent=1;
        		} else {
        			System.out.println("Employee is absent");
        			isPresent=0;
        		}
                switch (isPresent()) {
        		case 0:
        			System.out.println("Employee is absent");
        			break;
        		case 1:
        			System.out.println("Employmee is present");
        			break;
        		default:
        			break;
        		}
                
        }



        public static boolean isEmployeePresent() {
        	   Random rd = new Random();
        	   return rd.nextBoolean();
        }
        
        public static  int isPresent() {
        	   return isPresent;
        }
        
        
        
}
