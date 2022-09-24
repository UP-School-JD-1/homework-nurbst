package Ch3_course2_hw1;

public class RegistrationOfficeTest {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		Student st1 = registrationOffice.getAStudent();
		Student st2 = registrationOffice.getAStudent();
		Student st3 = registrationOffice.getAStudent();
		Student st4 = registrationOffice.getAStudent();
		Student st5 = registrationOffice.getAStudent();

		registrationOffice.registerStudent(st1);
		registrationOffice.registerStudent(st2);
		registrationOffice.registerStudent(st3);
		registrationOffice.registerStudent(st4);
		registrationOffice.registerStudent(st5);
	}

}