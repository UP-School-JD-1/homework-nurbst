package Ch1_course2;

import java.util.Date;

public class Student {
	public int no;
	public String name;
	public int year;
	public Date dob;
	public String major;

	public Student(int no, String name, int year, Date dob, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	void study() {
		System.out.println(getName() + " is studying " + getMajor());
	}

	void register() {
		System.out.println(getName() + " is registering...");
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name = " + name + ", year = " + year + " , major = " + major + "]";

	}


}