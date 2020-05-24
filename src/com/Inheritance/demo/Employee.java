package com.Inheritance.demo;

public class Employee extends Person {
	int age;

	Employee() {
		age = 34;
	}

	public void getDetails() {
		System.out.println(name + age);
	}
}
