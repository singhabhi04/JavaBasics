package com.demo.Interface;

public interface UKMedicalAssociation {

	public static final int DOC_FEE = 500;

	public void cardioServices();

	public void emergencyServices();

	public void virology();

	public void ambulanceServices();

	default void helpdeskFacility() {
		System.out.println("HelpDesk facilty is available");

	}

}
