package com.demo.TestAccessModifier;

import com.demo.accessmodifier.Meeting;

public class GoToMeeting {

	public static void main(String[] args) {
		Meeting meet = new Meeting(3433, "Test@123");
		System.out.println(meet.MeetingId);
		// System.out.println(meet.password);
		meet.start();
		// meet.chat();
		// System.out.println(meet.studentCount);// The field Meeting.studentCount is
		// not visible
		// System.out.println(meet.isrecorded);

	}

}
