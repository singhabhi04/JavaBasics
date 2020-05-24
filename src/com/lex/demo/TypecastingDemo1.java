package com.lex.demo;

public class TypecastingDemo1 {
	int phone = 765507;

	double getPhone() {

		System.out.println("Display phone number");
		return phone;
	}

	public static void main(String[] args) {
		TypecastingDemo1 tc = new TypecastingDemo1();
		System.out.println(tc.getPhone());
	}

}
