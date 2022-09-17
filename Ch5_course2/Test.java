package Ch5_course2;

public class Test {
	public static void main(String[] args) throws SalaryPaidOnBankException {

		HR hr = new HR();
		int m = 10;
		Employee[] employees = new Employee[m];
		for (int i = 0; i < m; i++)
			employees[i] = hr.getAnEmployee();

		for (Employee e : employees) {
			System.out.println(e);
		}
		try {
			for (Employee e : employees) {
				if (e.calculateSalary() > 7000) {
					throw new SalaryPaidOnBankException(e.name + " Please get your money from bank office");
				}
			}
		} catch (SalaryPaidOnBankException e2) {
			e2.printStackTrace();
		}

	}
}