package Ch9_course2_hw1_Comparator;

import java.util.Comparator;
import java.util.Date;

public abstract class AbstractStudent extends StudentComparator implements Student, Comparator<AbstractStudent> {

	protected int no;
	protected String name;
	protected int year;
	protected Date dob;
	protected String major;

	public AbstractStudent(int no, String name, int year, Date dob, String major) {
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

	@Override
	public String toString() {
		return " [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}

	public int compare(Object o) {
		AbstractStudent other = (AbstractStudent) o;
		int result = 0;
		if (no == other.no) {
			result = 0;
		} else if (no < other.no) {
			result = -1;
		} else {
			result = 1;
		}
		return result;

	}

}