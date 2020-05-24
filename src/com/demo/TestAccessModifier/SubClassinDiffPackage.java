package com.demo.TestAccessModifier;

import com.demo.accessmodifier.Meeting;

public class SubClassinDiffPackage extends Meeting {

	public SubClassinDiffPackage(int meetingId, String password) {
		super(meetingId, password);

	}

	public static void main(String[] args) {
		SubClassinDiffPackage subclass = new SubClassinDiffPackage(9855, "Test@343");
		Meeting meeting = new Meeting(3433, "Test@123");

		System.out.println(subclass.MeetingId);
		// System.out.println(subclass.password);// The field Meeting.password is not
		// visible
		subclass.start();
		// subclass.chat();// The method chat() from the type Meeting is not visible
		// System.out.println(subclass.studentCount);//The field Meeting.studentCount is
		// not visible
		System.out.println(subclass.isrecorded);
		// System.out.println(meeting.isrecorded);

	}

}
