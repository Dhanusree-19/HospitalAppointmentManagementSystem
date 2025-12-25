package com.BIThospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.BIThospital.model.Booking;
import com.BIThospital.model.NotifyPatient;
import com.BIThospital.service.NotifyPatientService;

public class NotifyPatientServiceImpl implements NotifyPatientService {

	
		private String sql = null;
		@Override
		public boolean add(NotifyPatient notifyPatient) {

	        sql = "INSERT INTO bithospital.notifypatient (patient_id, doctor_id, booking_id, p_message) VALUES (?,?,?,?)";

	        try (Connection connection = SqlManager.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	        	preparedStatement.setInt(1, notifyPatient. getPatientId());
	        	preparedStatement.setInt(2, notifyPatient.getDoctorId());
	        	preparedStatement.setInt(3, notifyPatient.getBookingId());
	        	preparedStatement.setString(4,notifyPatient.getMessage());
	            return preparedStatement.executeUpdate() > 0;

	        } catch (SQLException ex) {
	            System.err.println("Error while inserting doctor availability: " + ex.getMessage());
	        }

	        return false;
	}

}
