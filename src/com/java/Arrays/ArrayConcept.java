package com.java.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		int[] numb = new int[5];

		numb[0] = 10;
		numb[1] = 120;
		numb[2] = 130;
		numb[3] = 410;
		numb[4] = 180;
		System.out.println(numb[2]);

		System.out.println(numb.length);
		for (int i = 0; i < numb.length; i++) {
			System.out.println(numb[i]);

		}
		System.out.println("************************");
		// System.out.println(numb[5]);//java.lang.ArrayIndexOutOfBoundsException:
		// System.out.println(numb[-2]); // java.lang.ArrayIndexOutOfBoundsException:

		int[] x = new int[0];// valid way of declaration
		// int[] y = new int[-3];// RTE :java.lang.ArrayIndexOutOfBoundsException:

		int[] z = new int[2];
		System.out.println(z[0]);
		// if array values are not initialize then by default initialize with default
		// values
	}

}
