package Ch5_course2;

public class HR {

	void hR(Employee employee) {

		if (employee instanceof Secretary secretary1) {
			System.out.println("Secretary" + secretary1.toString());
			System.out.println();
			secretary1.printInfo();
		} else if (employee instanceof Engineer engineer1) {
			System.out.println("Engineer" + engineer1.toString());
			System.out.println();
			engineer1.printInfo();
		} else if (employee instanceof Manager manager1) {
			System.out.println("Manager" + manager1.toString());
			System.out.println();
			manager1.printInfo();
		} else if (employee instanceof Director director1) {
			System.out.println("Director" + director1.toString());
			System.out.println();
			director1.printInfo();
		} else
			employee.work();
	}

	public Employee getAnEmployee() {
		Employee e = null;

		int i = (int) (4 * Math.random());
		int no = new java.util.Random().nextInt(10);

		switch (i) {
		case 0:
			e = new Secretary(no, "Nur", 2020, "Finance", 8564,
					new Manager(3, "Melike", 2015, "Finance", "Finance", 5600));
			break;
		case 1:
			e = new Engineer(no, "Cenk", 2021, "IT", "Programming", 5000);
			break;
		case 2:
			e = new Manager(no, "Sibel", 2015, "Production", "Production", 1000);
			break;
		case 3:
			e = new Director(no, "Baran", 2019, "Management", "Management", 20000, 650);
			break;

		}
		return e;
	}
}