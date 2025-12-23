package com.BIThospital.model;

public class PatLogin {
	private Integer patientId;
	private String patientName;
	private Integer pin;
	
	
	public PatLogin(Integer patientId, String patientName, Integer pin) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.pin = pin;
	}


	public Integer getPatientId() {
		return patientId;
	}


	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public Integer getPin() {
		return pin;
	}


	public void setPin(Integer pin) {
		this.pin = pin;
	}
	
	
	
}









