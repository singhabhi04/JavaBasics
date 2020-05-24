package com.Inheritance.demo;

public class Customer extends Employee {
	int salary;

	Customer(int salary) {
		this.salary = salary;
		name = "Maddy";
	}

	public void getDetails() {
		System.out.println(name + age + salary);
	}
}
