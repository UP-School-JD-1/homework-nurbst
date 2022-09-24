package Ch9_course2_hw1_Comparator;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class RegistrationOfficeTest {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		List<AbstractStudent> listStudent=registrationOffice.getAllStudent();
		
		listStudent.add(new GraduateStudent(1826,"Sibel",2017,new Date(),"Software","Baran","C#"));
		
		Collections.sort(listStudent, new StudentComparator());
		
		for(AbstractStudent st: listStudent) {
			System.out.println(st);
		}
	}

}