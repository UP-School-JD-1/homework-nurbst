package Ch3_course2_hw1;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

	public boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis,
			boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	public boolean getQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	public void writePaper() {
		System.out.println(getName() + " is wirting paper");
	}

	@Override
	public void writeThesis() {
		System.out.println(getName() + " is writing thesis.");
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println(getName() + " met his advisor:  " + getAdvisor());
	}

	@Override
	public void study() {
		System.out.println(getName() + " is studying");
	}

	@Override
	public void register() {
		System.out.println(getName() + " is registering");
	}

}