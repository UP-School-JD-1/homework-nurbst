package Ch1_course2;

import java.util.Date;

public class GraduateStudent extends Student {
	public String advisor;
	public String thesis;

	public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	void study() {
		System.out.println(getName() + " is studying.");
	}

	void register() {
		System.out.println(getName() + " is registering life.");
	}

	void writeThesis() {
		System.out.println(getName() + " is writing thesis");
	}

	void meetWithAdvisor() {
		System.out.println(getName() + " meet advisor" + getAdvisor());
	}

}