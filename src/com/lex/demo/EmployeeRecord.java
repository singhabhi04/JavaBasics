package com.lex.demo;

public class EmployeeRecord {

	public static void main(String[] args) {
		double[] salary = { 50890, 46890, 17005, 8000, 19000, 44000, 3000 };
		double Sum = 0;
		for (int i = 0; i < salary.length; i++) {
			Sum = Sum + salary[i];
		}
		System.out.println(Sum);
		double AvgSalary = Sum / salary.length;
		System.out.println("Average salary of Employee is : " + AvgSalary);
		int countbelowavg = 0, countaboveAvg = 0;
		for (int j = 0; j < salary.length; j++) {

			if (AvgSalary > salary[j]) {
				countbelowavg++;

			} else {
				countaboveAvg++;

			}
		}
		System.out.println(countbelowavg + "  :  " + countaboveAvg);

	}
}