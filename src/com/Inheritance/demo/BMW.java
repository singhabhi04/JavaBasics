package com.Inheritance.demo;

public class BMW extends Car {
	public void start() {
		System.out.println("BMW has automatic start ");
	}

	public void theftSaftey() {
		System.out.println("Theft Saftey method");
	}

	public void stop() {
		System.out.println("BMW stop ");
	}
	// void stop() {
	// System.out.println("BMW stop ");
	// // Cannot reduce the visibility of the inherited method from Car
	// private<default<protected<public
	// }

	// public final void backCamera() {
	// System.out.println("back camera");
	// //Cannot override the final method from Car
	//
	// }

}
