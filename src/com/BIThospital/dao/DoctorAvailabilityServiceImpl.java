package com.BIThospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.BIThospital.model.DoctorAvailability;
import com.BIThospital.service.DoctorAvailabilityService;

public class DoctorAvailabilityServiceImpl implements DoctorAvailabilityService {

    private String sql;

    @Override
    public boolean add(DoctorAvailability doctorAvailability) {

        sql = "INSERT INTO bithospital.availabilityDoc (doctor_id, a_date, a_time) VALUES (?, ?,?)";

        try (Connection connection = SqlManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        	preparedStatement.setInt(1, doctorAvailability.getDoctorId());
        	preparedStatement.setString(2, doctorAvailability.getAvailableDate());
        	preparedStatement.setString(3, doctorAvailability.getAvailableTime());

            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException ex) {
            System.err.println("Error while inserting doctor availability: " + ex.getMessage());
        }

        return false;
    }
}
