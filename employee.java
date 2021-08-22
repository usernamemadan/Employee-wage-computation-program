package com.employee;

import java.util.Random;

public class Employee {

	static int FullDayHour = 8;
	static int WagePerHour = 20;
	static int DailyWage = FullDayHour * WagePerHour;
	static int WageforPartTimeWorking = 8;
	static int isPresent=isPresent();
	static int workingDays;
	static int workingHours;
	static int wages;
	

	
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
                
                System.out.println("Daily wage of employee " + DailyWage);
        		System.out.println("Wages for month" + DailyWage * 30);
        		System.out.println("Wages for month on condition: " + getWagesForMonth());
                
        }



        public static boolean isEmployeePresent() {
        	   Random rd = new Random();
        	   return rd.nextBoolean();
        }
        
        public static  int isPresent() {
        	   return isPresent;
        }
        
        private static long getWagesForMonth() {
    		int workingHours = 0;
    		workingDays = 0;
    		while (workingDays < FullDayHour && workingHours < WagePerHour) {
    			    workingDays++;
    				workingHours += FullDayHour;
    				wages += DailyWage;
    			
    		}
    		return wages;
    	}

        
}


