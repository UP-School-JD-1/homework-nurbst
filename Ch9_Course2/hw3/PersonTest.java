package Ch9_course2_h3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class PersonTest {
	public static void main(String[] args) {
		PersonList personList = new PersonList();
		Person p1 = new Person("Aleyna", "Bostan", new ArrayList<>(Arrays.asList("addresses1")),
				new ArrayList<>(Arrays.asList("phone1")));
		Person p2 = new Person("Melissa", "Corali", new ArrayList<>(Arrays.asList("addresses2")),
				new ArrayList<>(Arrays.asList("phone2")));
		Person p3 = new Person("Baran", "Bostan", new ArrayList<>(Arrays.asList("addresses3")),
				new ArrayList<>(Arrays.asList("phone3")));
		Person p4 = new Person("Serdar", "Karayel", new ArrayList<>(Arrays.asList("addresses4")),
				new ArrayList<>(Arrays.asList("phone4")));

		personList.add(p1);
		personList.add(p4);
		personList.add(p2);
		personList.add(p3);
		personList.add(p3);
		personList.add(p2);
		personList.add(p3);
		personList.add(p1);
		personList.add(p1);
		personList.add(p3);
		

		System.out.println("\n --- List People --- \n");
		personList.listPerson();
		System.out.println("\n --- Sort By Surname --- \n");
		printTreeSet(personList.sortBySurname());
		System.out.println("\n --- Search 'er' --- \n");
		printTreeSet(personList.search("er"));
	}

	private static void printTreeSet(TreeSet<Person> people) {
		Iterator iterator = people.iterator();
		while (iterator.hasNext()) {
			Person person = (Person) iterator.next();
			System.out.println(person.toString());
		}
	}
}
