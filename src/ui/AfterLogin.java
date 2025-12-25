package ui;

import java.util.Scanner;

public class AfterLogin {
	private Integer choice;
	private Scanner scanner = new Scanner(System.in);
	
	public void showWelcomeMessage() {
		System.out.println("Welcome! " + UserStatus.userId);
		showMenu();
	}

	public void showMenu() {
		System.out.println("1.Booking \n2.Notification\n3.Logout\n7.Exit");
		readChoice();
	}

	public void readChoice() {
		System.out.println("enter your choice:");
		this.choice = scanner.nextInt();
		operations();
	}
	
	public void operations() {
		switch (this.choice) {
		case 4:
			
			showMenu();
			break;
		case 6:
			UserStatus.isLoggedIn = false;
			UserStatus.userId = null;
			System.out.println("Logged out!");
			BeforeLogin beforeLogin = new BeforeLogin();
			beforeLogin.showWelcomeMessage();
			break;			
		case 7:
			System.out.println("See you again!");
			System.exit(0);
		}
	}

	
}

