package com.demo.Interface;

public class Hospital implements IndianMedicalAssociation, UKMedicalAssociation, USMedicalAssociation {

	@Override
	public void dentalFacility() {
		System.out.println("Dental facility is available ");
	}

	@Override
	public void orthopedicServices() {
		System.out.println("orthopedic Services  is available ");

	}

	@Override
	public void nueroServices() {
		System.out.println("Nuero Services  is available ");

	}

	@Override
	public void cardioServices() {
		System.out.println("Cardio Services  is available ");

	}

	@Override
	public void emergencyServices() {
		System.out.println("Emergency Services  is available ");

	}

	@Override
	public void virology() {
		System.out.println("Virology Services  is available ");

	}

	@Override
	public void ambulanceServices() {
		System.out.println("Ambulance Services  is available ");

	}

	@Override
	public void eyeServices() {
		System.out.println("Eye Services  is available ");

	}

	@Override
	public void diabeticservice() {
		System.out.println("Diabetic Services  is available ");

	}

	@Override
	public void dietservice() {
		System.out.println("dietican Services  is available ");

	}

	@Override
	public void physioservice() {
		System.out.println("Physio Services  is available ");

	}

	public void TPAFacilty() {
		System.out.println("TPA facility is present");
	}

	public void MinDocFee() {
		System.out.println(DOC_FEE);
	}
}
