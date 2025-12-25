package com.BIThospital.model;


public class DoctorAvailability {
	private Integer doctorId;
	private Integer availabilityId;
	private String  availableDate;
	private String  availableTime;
	
	
	
	public DoctorAvailability(Integer doctorId, Integer availabilityId, String availableDate,
			String availableTime) {
		super();
		this.doctorId = doctorId;
		this.availabilityId = availabilityId;
		this.availableDate = availableDate;
		this.availableTime = availableTime;
	}


	public Integer getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}


	public Integer getAvailabilityId() {
		return availabilityId;
	}


	public void setAvailabilityId(Integer availabilityId) {
		this.availabilityId = availabilityId;
	}


	public String getAvailableDate() {
		return availableDate;
	}


	public void setAvailableDate(String availableDate) {
		this.availableDate = availableDate;
	}


	public String getAvailableTime() {
		return availableTime;
	}


	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}
	
	
	
	
}
