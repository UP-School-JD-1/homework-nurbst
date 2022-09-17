package Ch5_course2;

public class Engineer extends Employee {

	private String project;
	public static final int BASE_SALARY = 1000;

	public Engineer(int no, String name, int year, String department, String project, double calculateSalary) {
		super(no, name, year, department, calculateSalary);
		this.project = project;
	}

	public void work() {
		System.out.println(name + " is Engineer.");
		System.out.println(name + " is working on a project : " + project);

	}

	public void assignTask(String task) {
		System.out.println("Engineer " + name + "works on the task : " + task);
	}

	public double calculateSalary() {
		return year * BASE_SALARY;
	}

	@Override
	public String toString() {
		return "Engineer [no=" + no + ", project=" + project + ", name=" + name + ", year=" + year + ", department="
				+ department + ", salary=" + calculateSalary + "]";
	}
}