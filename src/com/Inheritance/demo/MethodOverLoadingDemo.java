package com.Inheritance.demo;

public class MethodOverLoadingDemo {

	public void method(int age, int roll) {
		System.out.println("Inside Age and Roll");
	}

	// public void method(int age) {
	// System.out.println("Inside int Age");
	// }

	public void method(float age) {
		System.out.println("Inside float Age");
	}

	public static void main(String[] args) {
		MethodOverLoadingDemo mol = new MethodOverLoadingDemo();
		mol.method(10);
	}

}
