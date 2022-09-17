package Ch5_course2;

public class Manager extends Employee {

	protected String departmentManaged;

	public static final int MANAGEMENT_PAYMENT = 3000;

	public Manager(int no, String name, int year, String workingDepartment, String departmentManaged,
			double calculateSalary) {
		super(no, name, year, workingDepartment, calculateSalary);
		this.departmentManaged = departmentManaged;
	}

	public void work() {
		System.out.println(name + " is Manager.");
		System.out.println(name + " is working");
		manage();

	}

	private void manage() {
		System.out.println(name + " manages department : " + departmentManaged);

	}

	public double calculateSalary() {
		return super.calculateSalary() + MANAGEMENT_PAYMENT;
	}

	public void printInfo() {
		System.out.println("\nManager Info");
		super.printInfo();
		System.out.println("managing department : " + departmentManaged);
	}

	@Override
	public String toString() {
		return "Manager [no=" + no + ", departmentManaged=" + departmentManaged + ", name=" + name + ", year=" + year
				+ ", department=" + department + ", salary=" + calculateSalary + "]";
	}

}