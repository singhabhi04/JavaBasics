package com.demo.accessmodifier;

public class Zoom {

	public static void main(String[] args) {
		Meeting meet = new Meeting(3433, "Test@123");
		System.out.println(meet.MeetingId);
		// System.out.println(meet.password);//The field Meeting.password is not visible

		meet.start();
		// meet.chat();//The method chat() from the type Meeting is not visible

		System.out.println(meet.studentCount);
		System.out.println(meet.isrecorded);

	}

}
