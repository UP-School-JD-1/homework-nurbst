package Ch9_course2_hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class RegistrationOfficeTest {

	public static void main(String[] args) {

		List<Student> listStudent = new ArrayList<Student>();

		listStudent.add(new Student(12, "Nur", 1997, new Date(), "Enginner"));
		listStudent.add(new Student(14, "Mustafa", 2000, new Date(), "Aviation"));
		listStudent.add(new Student(16, "Melissa", 1999, new Date(), "Enginner"));
		listStudent.add(new Student(18, "Zelal", 1997, new Date(), "Enginner"));
		listStudent.add(new Student(20, "Ecem", 1996, new Date(), "Economy"));

		Collections.sort(listStudent);

		for (Student st : listStudent) {
			System.out.println(st);
		}

	}

}