package Ch5_course2;

public class Employee implements Worker {
	protected int no;
	protected String name;
	protected int year;
	protected String department;
	protected double calculateSalary;

	public Employee(int no, String name, int year, String department, double calculateSalary) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
		this.calculateSalary = calculateSalary;
	}

	public void printInfo() {
		System.out.println("/nNo : " + no);
		System.out.println("Name : " + name);
		System.out.println("Year : " + year);
		System.out.println("Department : " + department);
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getCalculateSalary() {
		return calculateSalary;
	}

	public void setCalculateSalary(double calculateSalary) {
		this.calculateSalary = calculateSalary;
	}

	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", year=" + year + ", department=" + department + ", salary="
				+ calculateSalary + "]";
	}

	@Override
	public void work() {
		System.out.println(name + " is Employee.");
		System.out.println(name + " is working");

	}

	@Override
	public double calculateSalary() {
		return year * BASE_SALARY;
	}

}