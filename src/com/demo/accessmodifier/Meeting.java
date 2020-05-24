package com.demo.accessmodifier;

public class Meeting {

	public int MeetingId;
	private String password;
	int studentCount = 100;
	protected boolean isrecorded = true;;

	public Meeting(int meetingId, String password) {

		this.MeetingId = meetingId;
		this.password = password;
	}

	public void start() {
		System.out.println("Meeting Started");
	}

	private void chat() {
		System.out.println("Chat feature");

	}

	public static void main(String[] args) {
		Meeting meet = new Meeting(3433, "Test@123");
		System.out.println(meet.MeetingId);
		System.out.println(meet.password);
		meet.start();
		meet.chat();
		System.out.println(meet.studentCount);
		System.out.println(meet.isrecorded);

	}

}
