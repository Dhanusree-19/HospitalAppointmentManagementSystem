package com.BIThospital.model;

public class Patient {
	private Integer patientId;
	private String patientName;
	private String phoneNo;
	private PatLogin patLogin;
	
	
	
	public Patient(Integer patientId, String patientName, String phoneNo, PatLogin patLogin) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.phoneNo = phoneNo;
		this.patLogin = patLogin;
	}

	public Patient(Integer patientId, String patientName, String phoneNo) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.phoneNo = phoneNo;
	}

	
	
	public PatLogin getPatLogin() {
		return patLogin;
	}

	public void setPatLogin(PatLogin patLogin) {
		this.patLogin = patLogin;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	
}
