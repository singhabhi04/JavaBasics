package com.java.Arrays;

public class ObjectArrayConcept {

	public static void main(String[] args) {
		Object[] emp = new Object[4];
		emp[0] = "can store any thing";
		emp[1] = 10;
		emp[2] = 20.52;
		emp[3] = 'F';
		System.out.println(emp[0]);
		System.out.println("**********************");
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}

	}

}
