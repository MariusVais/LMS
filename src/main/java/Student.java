package main.java;

public class Student extends User {
	private static int studentID = 0;
	private int course;
	private int semester;
	private int group;
	private Subject[] curriculum;

	public Student(final String username, final String password) {
		super(username, password, UserType.STUDENT);
		setStudentID();
	}
	private void setStudentID() {
		++studentID;
	}
	public static int getStudentID() {
		return studentID;
	}
	public void setCourse(final int course) {
		this.course = course;
	}
	public int getCourse() {
		return this.course;
	}
	public void setSemester(final int semester) {
		this.semester = semester;
	}
	public int getSemester() {
		return this.semester;
	}
	public void setGroup(final int group) {
		this.group = group;
	}
	public int getGroup() {
		return this.group;
	}
	public void addSubject(final Subject subject) {

	}
	public void removeSubject(final int i) {

	}
}
