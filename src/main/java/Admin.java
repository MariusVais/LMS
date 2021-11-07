package main.java;

public class Admin extends User {
	private static int adminID = 0;
	public Admin(final String username, final String password) {
		super(username, password, UserType.ADMIN);
		setAdminID();
	}
	private void setAdminID() {
		++adminID;
	}
	public static int getAdminID() {
		return adminID;
	}
}
