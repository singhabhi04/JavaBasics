package com.demo.accessmodifier;

public class SubClassinSamePackage extends Meeting {

	public SubClassinSamePackage(int meetingId, String password) {
		super(meetingId, password);

	}

	public static void main(String[] args) {
		SubClassinSamePackage subclass = new SubClassinSamePackage(9855, "Test@343");
		System.out.println(subclass.MeetingId);
		// System.out.println(subclass.password);// The field Meeting.password is not
		// visible
		subclass.start();
		// subclass.chat();//The method chat() from the type Meeting is not visible
		System.out.println(subclass.studentCount);
		System.out.println(subclass.isrecorded);

	}

}
