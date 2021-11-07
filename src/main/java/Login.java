package main.java;

import java.util.Scanner;

public class Login {
	private static int maxAttempts = 3;
	private String username = "admin";
	private String password = "admin";
	private UserType userType = UserType.ADMIN;

	public Login(final Database database) {
		System.out.println("\tLearning Management System");

		Scanner scanner = new Scanner(System.in);
		boolean badUsername;
		boolean badPassword;
		int attempts = 0;
		do {
			badUsername = false;
			badPassword = false;

			System.out.print("username: ");	
			setUsername(scanner.nextLine());
			System.out.print("password: ");
			setPassword(scanner.nextLine());

			// check database if username exists
			if (database.hasRecord(this.username)) {
				// check if password is correct
				if (database.getPassword(this.username).equals(this.password)) {
					// set user type for module
					setUserType(database.getUserType(this.username));
				} else {
					badPassword = true;
					if (++attempts >= maxAttempts) {
						System.out.println("Login interrupted: too many failed attempts");
						System.exit(1);
					}
					System.out.println("Login failed: incorrect password");
				}
			} else {
				badUsername = true;
				if (++attempts >= maxAttempts) {
					System.out.println("Login interrupted: too many failed attempts");
					System.exit(1);
				}
				System.out.println("Login failed: incorrect/nonexistent username");
			}
			
		} while (badUsername || badPassword);
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setUserType(final UserType userType) {
		this.userType = userType;
	}

	public UserType getUserType() {
		return this.userType;
	}
}