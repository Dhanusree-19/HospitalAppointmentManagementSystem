package com.BIThospital.model;

public class DocLogin {

	Integer doctorId ;
	String doctorName;
	Integer pin;
	
	
	public DocLogin(Integer doctorId, String doctorName, Integer pin) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.pin = pin;
	}


	public Integer getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public Integer getPin() {
		return pin;
	}


	public void setPin(Integer pin) {
		this.pin = pin;
	}
	
	
	
	
	
}
