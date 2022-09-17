package Ch2_course2;

import java.util.Date;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
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
		return "UndergraduateStudent [getNo()=" + getNo() + ", getName()=" + getName() + ", getYear()=" + getYear()
				+ ", getDob()=" + getDob() + ", getMajor()= " + getMajor() + "]";
	}

}