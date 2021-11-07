package main.java;

enum UserType {
	ADMIN,
	TEACHER,
	STUDENT
}

public class User {
	private static int userID = 0;
	private String username;
	private String password;
	private String name;
	private String surname;
	private UserType userType;
	
	public User(final String username, final String password, final UserType userType) {
		setUserID();
		setUsername(username);
		setPassword(password);
		setUserType(userType);
	}
	private void setUserID() {
		++userID;
	}
	public static int getUserID() {
		return userID;
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
	public void setName(final String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setSurname(final String surname) {
		this.surname = surname;
	}
	public String getSurname() {
		return this.surname;
	}
	public void setUserType(final UserType userType) {
		this.userType = userType;
	}
	public UserType getUserType() {
		return this.userType;
	}
}
