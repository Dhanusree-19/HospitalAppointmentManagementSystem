package com.BIThospital.dao;

import com.BIThospital.model.Booking;
import com.BIThospital.service.BookingService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.BIThospital.service.BookingService;

public class BookingServiceImpl implements BookingService{
	
	private String sql = null;
	@Override
	public boolean add(Booking booking) {

        sql = "INSERT INTO bithospital.booking (patient_id, doctor_id, a_id, booking_confirmation) VALUES (?,?,?,?)";

        try (Connection connection = SqlManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        	preparedStatement.setInt(1, booking. getPatientId());
        	preparedStatement.setInt(2, booking.getDoctorId());
        	preparedStatement.setInt(3, booking.getAvailabilityId());
        	preparedStatement.setString(04,booking.getBookingConfirmation().name().toLowerCase());
            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException ex) {
            System.err.println("Error while inserting doctor availability: " + ex.getMessage());
        }

        return false;
	}


}
