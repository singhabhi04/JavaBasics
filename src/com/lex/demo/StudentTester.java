package com.lex.demo;

public class StudentTester {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("Jacob");
		st1.setStudentId(101);
		st1.setResidentialStatus('H');
		st1.setQualifyingExamMarks(80);
		st1.setYearOfEngineering(3);

		System.out.println("*********Student Information**********");
		System.out.println("Student Name : " + st1.getName());
		System.out.println("Student ID : " + st1.getStudentId());
		System.out.println("Qualifying marks :" + st1.getQualifyingExamMarks());
		System.out.println("Student Residential Status : " + st1.getResidentialStatus());
		System.out.println("Year of Engineering :" + st1.getYearOfEngineering());
		// String Str = "This is a demmo string for testing is a";
		// System.out.println(Str.substring(6));
		// System.out.println(Str.length());
		// System.out.println(Str.indexOf("is", Str.indexOf("is") + 1));

	}

}
