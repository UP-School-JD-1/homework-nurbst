package Ch9_course2_hw1_Comparator;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class RegistrationOffice {

	RegistrationOffice() {

	}

	void registerStudent(Student student) {

		if (student instanceof GraduateStudent graduateSt1) {
			System.out.println("GraduateStudent" + graduateSt1.toString());
		} else if (student instanceof VocationalStudent vocationalSt1) {
			System.out.println("VocationalStudent" + vocationalSt1.toString());
		} else if (student instanceof UndergraduateStudent undergraduateSt1) {
			System.out.println("UndergraduateStudent" + undergraduateSt1.toString());
		} else if (student instanceof MasterStudent masterSt1) {
			System.out.println("MasterStudent" + masterSt1.toString());
		} else if (student instanceof PhdStudent phdSt1) {
			System.out.println("PhdStudent" + phdSt1.toString());
		} else
			student.study();
	}

	Student getAStudent() {
		Student student = null;

		int i = (int) (5 * Math.random());
		int no = new java.util.Random().nextInt(10);

		switch (i) {
		case 0:
			student = new GraduateStudent(no, "Nur", 2012, new Date(), "Information System Engineering", "Alex",
					"Java");
			break;
		case 1:
			student = new VocationalStudent(no, "Alex", 2010, new Date(), "Computer Science");
			break;
		case 2:
			student = new UndergraduateStudent(no, "Baran", 2019, new Date(), "Cabin Crew", "");
			break;
		case 3:
			student = new MasterStudent(no, "Melissa", 2010, new Date(), "Computer Engineering", "Nur", "Android");
			break;
		case 4:
			student = new PhdStudent(no, "Ecem", 2013, new Date(), "Economy", "Nur", "", true);
			break;
		}
		return student;
	}
	
	
	public List<AbstractStudent> getAllStudent(){
		List<AbstractStudent> listStudent=new ArrayList<AbstractStudent>();
		listStudent.add(new GraduateStudent(200,"Nur", 2012, new Date(), "Information System Engineering", "Alex",
				"Java"));
		listStudent.add(new VocationalStudent(420,"Alex", 2010, new Date(), "Computer Science"));
		listStudent.add(new UndergraduateStudent(580,"Baran", 2019, new Date(), "Cabin Crew", ""));
		listStudent.add(new MasterStudent(102,"Melissa", 2010, new Date(), "Computer Engineering", "Nur", "Android"));
		listStudent.add(new PhdStudent(298,"Ecem", 2013, new Date(), "Economy", "Nur", "", true));
		
		return listStudent;
		
	}

}