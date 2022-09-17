package Ch2_course2;

import java.util.Date;

public class RegistrationOfficeTest {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		// GraduateStudent
		Student st1 = new GraduateStudent(200, "Nur ", 1997, new Date(), "ISE", "Serdar", "Java");

		if (st1 instanceof GraduateStudent graduateSt1) {
			System.out.println(st1.getName() + " is GraduateStudent.");

			System.out.println(graduateSt1.toString());
		} else
			System.out.println(st1.getName() + " isn't GraduateStudent ");

		// MasterStudent

		Student st2 = new GraduateStudent(250, "Melissa ", 1999, new Date(), "CE", "Aleyna", "Android");

		if (st2 instanceof MasterStudent masterSt2) {
			System.out.println(st2.getName() + " is GraduateStudent : ");
			System.out.println(masterSt2.toString());
		} else
			System.out.println(st2.getName() + " isn't MasterStudent ");
		System.out.println();

		// UndergraduateStudent

		Student st3 = new UndergraduateStudent(300, "Berna", 1999, new Date(), "Ce", "ce");
		if (st3 instanceof UndergraduateStudent undergraduateSt1) {
			System.out.println(st3.getName() + " is UndergraduateStudent ");
			System.out.println(undergraduateSt1.toString());
		}

		// PhdStudent

		Student st4 = new PhdStudent(400, "Melis", 1998, new Date(), "CS", "cs", "Swift", false);

		if (st4 instanceof PhdStudent phdSt1) {
			System.out.println(st4.getName() + "  is GraduateStudent");
			System.out.println(phdSt1.toString());
		} else
			System.out.println(st4.getName() + " isn't MasterStudent ");
		System.out.println();

		// VocationalStudent

		Student st5 = new VocationalStudent(450, "Mustafa", 1995, new Date(), "CabinCrew");
		if (st5 instanceof VocationalStudent vocationalSt1) {
			System.out.println(st5.getName() + " is VocationalStudent");
			System.out.println(vocationalSt1.toString());
		}
		// RegistrationOffice

		registrationOffice.RegisterStudent(st4);
		st4.equals(st2);
		System.out.println(st1.equals(st2));
		st1.register();

	}

}