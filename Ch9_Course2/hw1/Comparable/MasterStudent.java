package Ch9_course2_hw1;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dob, String major, String advisor) {
		super(no, name, year, dob, major, advisor);

	}

	@Override
	public void writeThesis() {
		System.out.println(getName() + " is writing thesis.");
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println(getName() + " meet his advisor:  " + getAdvisor());
	}

	@Override
	public void study() {
		System.out.println(getName() + " is studying.");
	}

	@Override
	public void register() {
		System.out.println(getName() + " is registering");
	}

}