package Ch9_course2_hw1_Comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<AbstractStudent>{


	@Override
	public int compare(AbstractStudent o1, AbstractStudent o2) {
		return o1.getYear() - o2.getYear();
	}
}