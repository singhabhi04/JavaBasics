package com.java.Arrays;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(200);
		al.add(522);
		al.add("Abhishek");
		al.add('F');
		System.out.println(al.size());
		al.add("Bhubaneshwar");
		al.add(1025013);
		System.out.println(al.size());
		System.out.println(al.get(2));
		al.remove(3);
		System.out.println(al.size());
		// System.out.println(al.get(5));//java.lang.IndexOutOfBoundsException:

		System.out.println("Index of 522 is " + al.indexOf(522));
		al.add(522);

		System.out.println("Index of 522 is " + al.indexOf(522));
		System.out.println(al.lastIndexOf(522));
		al.add(null);

	}

}
