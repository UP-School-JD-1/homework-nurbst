package Ch5_course2;

public class Director extends Manager {

	protected double bonus;

	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus,
			double calculateSalary) {
		super(no, name, year, workingDepartment, managingDepartment, calculateSalary);
		this.bonus = bonus;
	}

	public void work() {
		System.out.println(name + " is Director.");
		System.out.println(name + " is working");
		manage();

	}

	public void manage() {
		System.out.println(name + " manages whole company!");
		makeAStrategicPlan();
	}

	public void makeAStrategicPlan() {
		System.out.println(name + "  makes a strategic plan for the company!");
	}

	public double calculateSalary() {
		return super.calculateSalary() + bonus;
	}

	public void printInfo() {
		System.out.println("\nDirector Info : ");
		super.printInfo();
	}

	@Override
	public String toString() {
		return "Director [no=" + no + ", bonus=" + bonus + ", departmentManaged=" + departmentManaged + ", name=" + name
				+ ", year=" + year + ", department=" + department + "]";
	}

}