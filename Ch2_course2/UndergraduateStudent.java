package Ch2_course2;

import java.util.Date;

public class UndergraduateStudent extends Student {
	protected String minor;

	public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	@Override
	public void study() {
		System.out.println(getName() + " is studying.");
	}

	@Override
	public void register() {
		System.out.println(getName() + " is registering");
	}

	@Override
	public String toString() {
		return "UndergraduateStudent [getMinor()=" + getMinor() + ", getNo()=" + getNo() + ", getName()=" + getName()
				+ ", getYear()=" + getYear() + ", getDob()=" + getDob() + ", getMajor()= " + getMajor() + "]";
	}

}