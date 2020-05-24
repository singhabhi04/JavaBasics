package com.lex.demo;

public class TypecastingDemo {

	public static void main(String[] args) {
		double d = 222.0555;
		// long lo =200.033;
		long l = (long) d;
		int i = (int) l;
		System.out.println(l);
		System.out.println(d);
		System.out.println(i);

	}

}
