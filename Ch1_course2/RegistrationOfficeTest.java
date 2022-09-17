package Ch1_course2;

import java.util.Date;


public class RegistrationOfficeTest {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		//GraduateStudent
		Student st1 = new Student(200, "Nur ", 1997, new Date(), "ise");

		if (st1 instanceof GraduateStudent) {
			System.out.println(st1.getName()+" is GraduateStudent.");
			GraduateStudent graduateSt1 = (GraduateStudent) st1;
			System.out.println(graduateSt1.toString());
		} else
			System.out.println(st1.getName() + " isn't GraduateStudent ");

		//MasterStudent

		Student st2 = new GraduateStudent(250, "Melissa ", 1999, new Date(), "", "");

		if (st2 instanceof MasterStudent) {
			System.out.println(st2.getName()+" is GraduateStudent : " );
			MasterStudent masterSt2 = (MasterStudent) st2;
			System.out.println(masterSt2.toString());
		} else
			System.out.println(st2.getName() + " isn't MasterStudent ");
		System.out.println();

		//UndergraduateStudent

		Student st3 = new UndergraduateStudent(300, "Berna", 1999, new Date(), "Ce", "ce");
		if (st3 instanceof UndergraduateStudent) {
			System.out.println(st3.getName()+" is UndergraduateStudent ");
			UndergraduateStudent undergraduateSt1 = (UndergraduateStudent) st3;
			System.out.println(undergraduateSt1.toString());
		}

		//PhdStudent

		Student st4 = new PhdStudent(400, "Melis", 1998, new Date(), "CS", "cs", false);

		if (st4 instanceof PhdStudent) {
			System.out.println(st4.getName()+"  is GraduateStudent" );
			PhdStudent phdSt1 = (PhdStudent) st4;
			System.out.println(phdSt1.toString());
		} else
			System.out.println(st4.getName() + " isn't MasterStudent ");
		System.out.println();

		//RegistrationOffice

		registrationOffice.RegisterStudent(st4);
		st4.equals(st2);
		System.out.println(st1.equals(st2));
		st1.register();

	}

}