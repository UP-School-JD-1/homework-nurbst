package Ch5_course2;

public class Secretary extends Employee {

	protected Manager managerServed;
	public static final int BASE_SALARY = 800;

	public Secretary(int no, String name, int year, String department, double calculateSalary, Manager managerServed) {
		super(no, name, year, department, calculateSalary);
		this.managerServed = managerServed;
	}

	public void serve() {
		System.out.println("Secretary" + name + "serves her manager : " + managerServed);
	}

	public void work() {
		System.out.println(name + " is Secretary.");
		System.out.println(name + " is working ");
		serve();
	}

	public double calculateSalary() {
		return year * BASE_SALARY;
	}

	@Override
	public String toString() {
		return "Secretary [no=" + no + ", managerServed=" + managerServed + ", name=" + name + ", year=" + year
				+ ", department=" + department + "]";
	}
}