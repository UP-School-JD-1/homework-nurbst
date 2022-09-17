package Ch2_course2;

public class RegistrationOffice {

	RegistrationOffice() {

	}

	Student getAStudent(Student student) {
		System.out.println(student.getName());
		return student;
	}

	public void RegisterStudent(Student student) {

		System.out.println("Student registration information: ");
		System.out.println("Student's name: " + student.getName());
		System.out.println("Student number: " + student.getNo());
		System.out.println("Student's major : " + student.getMajor());
		System.out.println("Student's registration date: " + student.getDob());

	}

}