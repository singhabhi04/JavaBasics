package com.Inheritance.demo;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Car();
		BMW bmw = new BMW();
		bmw.start();
		car.start();
		bmw.stop();
		car.stop();
		bmw.blowHorn();
		car.refueling();
		bmw.refueling();
		bmw.theftSaftey();
		// bmw.demo();

		System.out.println("*********************");
		Car car1 = new BMW();
		car1.start();
		car1.refueling();
		bmw.start();

		// car1.theftSaftey();
		/*
		 * Parent Reference can be used to hold child object but with this reference we
		 * cannot call child class specific methods.
		 */

		// BMW bmw1 = new Car();
		// child class reference cannot be used to hold Parent class object.

		// BMW bmw1 = (BMW) new Car();//java.lang.ClassCastException:
		// Person c = new Customer(20000);
		// c.getDetails();
	}

}
