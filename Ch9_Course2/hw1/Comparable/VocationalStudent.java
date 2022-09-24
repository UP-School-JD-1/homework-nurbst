package Ch9_course2_hw1;

import java.util.Date;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}

	@Override
	void study() {
		System.out.println(getName() + " is studying.");
	}

	@Override
	void register() {
		System.out.println(getName() + " is registering");
	}

	@Override
	public String toString() {
		return "UndergraduateStudent [getNo()=" + getNo() + ", getName()=" + getName() + ", getYear()=" + getYear()
				+ ", getDob()=" + getDob() + ", getMajor()= " + getMajor() + "]";
	}

}