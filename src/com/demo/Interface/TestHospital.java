package com.demo.Interface;

public class TestHospital extends Hospital {

	public static void main(String[] args) {
		Hospital hos = new Hospital();
		hos.ambulanceServices();
		hos.dentalFacility();
		hos.cardioServices();
		hos.diabeticservice();
		hos.emergencyServices();
		hos.dietservice();
		hos.eyeServices();
		hos.TPAFacilty();
		hos.nueroServices();
		hos.orthopedicServices();
		hos.physioservice();
		hos.helpdeskFacility();
		hos.MinDocFee();
		System.out.println(UKMedicalAssociation.DOC_FEE);

		USMedicalAssociation us = new Hospital();
		us.ambulanceServices();
		us.dentalFacility();
		us.nueroServices();

		us.orthopedicServices();

	}

}
