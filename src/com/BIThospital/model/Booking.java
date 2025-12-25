package com.BIThospital.model;

public class Booking{
	private Integer bookingId;
	private Integer patientId;
	private Integer doctorId;
	private Integer availabilityId;
	private BookingStatus bookingConfirmation;
	
	public Booking(Integer patientId, Integer doctorId, Integer availabilityId, Integer bookingId,
			BookingStatus bookingConfirmation) {
		super();
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.availabilityId = availabilityId;
		this.bookingId = bookingId;
		this.bookingConfirmation = bookingConfirmation;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
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

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public BookingStatus getBookingConfirmation() {
		return bookingConfirmation;
	}

	public void setBookingConfirmation(BookingStatus bookingConfirmation) {
		this.bookingConfirmation = bookingConfirmation;
	}
	
	
	
}