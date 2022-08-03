package com.infogalaxy;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// UC-1 Check Employee Attendance
		int checkAttendance = (int)(Math.random()*10)%2;
		System.out.println(checkAttendance);
		if(checkAttendance == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

}
