package main.java;

public class Teacher extends User {
	private static int teacherID = 0;
	private Subject[] curriculum;
	private Student[] students;

	public Teacher(final String username, final String password) {
		super(username, password, UserType.TEACHER);
		setTeacherID();
	}
	private void setTeacherID() {
		++teacherID;
	}
	public static int getTeacherID() {
		return teacherID;
	}

}
