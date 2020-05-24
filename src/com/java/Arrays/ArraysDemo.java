package com.java.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] s = new int[0];
		int[] arry = new int[10];
		// int[] arry = new int[110]; invalid
		int[][] arry1 = new int[10][5];
		String[] str = new String[5];
		boolean[] b = new boolean[7];
		char[] c = new char[10];

		System.out.println(arry.getClass().getName());
		System.out.println(arry1.getClass().getName());
		System.out.println(str.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
		System.out.println(s.getClass().getName());
		System.out.println(arry1);

	}

}
