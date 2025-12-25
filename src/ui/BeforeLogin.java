package ui;

import java.util.Scanner;

import com.BIThospital.model.PatLogin;
import com.BIThospital.model.Patient;
import com.BIThospital.service.PatientService;

public class BeforeLogin {
	private Integer choice;
	private PatLogin patLogin;
	private PatientService patientService;
	private Scanner scanner = new Scanner(System.in);
	
	public void showWelcomeMessage() {
		System.out.println("Welcome to BIThospital!");
		showMenu();
	}
	
	private void showMenu() {
		System.out.println("1.Sign up\n2.Login\n3.Exit");
		readChoice();
	}
	
	private void readChoice() {
		System.out.println("enter your choice:");
		this.choice = scanner.nextInt();
		operations();
	}
	

	private void operations() {
		switch (this.choice) {
		case 1:
			showSignup();
			showMenu();
			break;
		case 2:
			showLogin();
			showMenu();
			break;
		case 3:
			System.out.println("See you again!");
			System.exit(0);
		}
	}
	
	private void showLogin() {
		System.out.print("enter user name & PIN: ");
		patLogin = patientService.authenticate(new PatLogin(null, scanner.next(), scanner.nextInt()));
		if (patLogin != null) {
			// login successful....
			System.out.println("Authenticated....");
			UserStatus.isLoggedIn = true;
			UserStatus.userId = patLogin.getPatientId();
			AfterLogin afterLogin = new AfterLogin();
			afterLogin.showWelcomeMessage();
		} else {
			System.err.println("Invalid username/PIN.\nTry again later.");
		}
	}
	
	private void showSignup() {
		System.out.print("enter name, phoneNo, username & PIN: ");
		if (patientService.add(new Patient(null, scanner.next(), scanner.next() , new PatLogin(null, scanner.next(), scanner.nextInt())))) {
			System.out.println("Congartulations!\nYour account created....");
		} else {
			System.err.println("Account creation failed.\nTry again later.");

		}
	}
}


