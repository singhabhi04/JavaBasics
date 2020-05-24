package com.java.loops;

public class ForLoopDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------");
		// break

		for (int j = 0; j < 10; j++) {
			System.out.println(j);
			if (j == 5) {
				System.out.println("Validating break when 5 is reached");
				break;

			}
		}
	}
}