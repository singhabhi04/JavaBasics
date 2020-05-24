package com.demo.Interface;

public abstract class Page {

	public abstract void login();

	public void getTitle() {
		System.out.println("Page Title");
	}

	public abstract void logout();
}
