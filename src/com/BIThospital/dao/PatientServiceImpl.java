package com.BIThospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.BIThospital.model.PatLogin;
import com.BIThospital.model.Patient;
import com.BIThospital.service.PatientService;

public class PatientServiceImpl implements PatientService{
	private String sql = null;
	@Override
	public boolean add(Patient patient) {
		try {
			Connection connection = SqlManager.getConnection();
			sql = "insert into  bithospital.registerPat (patient_name,phone_number) values (?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, patient.getPatientName());
			preparedStatement.setInt(2, patient.getPhoneNo());
			if(preparedStatement.executeUpdate() > 0) {
				ResultSet resultSet = preparedStatement.getGeneratedKeys();
				if(resultSet.next()) {
					patient.setPatientId(resultSet.getInt(1));
					sql = "insert into bithospital.loginPat (patient_id,patient_name, pin) values (?, ?, ?)";
					preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setInt(1, patient.getPatientId());
					preparedStatement.setString(2, patient.getPatLogin().getPatientName());
					preparedStatement.setInt(3, patient.getPatLogin().getPin());
					
					if(preparedStatement.executeUpdate() > 0) {
						return true;
					}					
				}
			}
		} catch(SQLException ex) {
			System.err.println("Exception raised during connection : " + ex.getMessage());
		}
		return false;
	}

	@Override
	public PatLogin authenticate(PatLogin patLogin) {
		
		try {
			Connection connection = SqlManager.getConnection();
			sql = "select patient_id from bithospital.loginPat where patient_name = '" + patLogin.getPatientName()
					+ "' AND pin = " + patLogin.getPin();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				patLogin.setPatientId(resultSet.getInt("PatientId"));
				patLogin.setPin(null);
				return patLogin;
			}
		} catch (SQLException ex) {
			System.err.println("Exception raised during connection : " + ex.getMessage());
		}

		return null;
	}

}
