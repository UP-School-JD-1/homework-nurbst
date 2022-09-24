package Ch9_course2_h3;

import java.util.*;

public class PersonList {
	private TreeSet<Person> people;

	PersonList() {
		Comparator<Person> comparatorBySurname = (p1, p2) -> {
			if (p1.getSurname().equals(p2.getSurname())) {
				return 0;
			}
			return p1.getSurname().compareTo(p2.getSurname());
		};
		people = new TreeSet<>(comparatorBySurname);
	}

	public boolean add(Person person) {
		return people.add(person);
	}

	public void listPerson() {
		Iterator iterator = people.iterator();
		while (iterator.hasNext()) {
			Person person = (Person) iterator.next();
			System.out.println(person.toString());
		}
	}

	public TreeSet<Person> search(String value) {
		TreeSet<Person> result = new TreeSet<>();
		Iterator iterator = people.iterator();
		while (iterator.hasNext()) {
			Person person = (Person) iterator.next();
			boolean foundInAddresses = person.getAddresses().stream().anyMatch(s -> s.contains(value));
			boolean foundInPhones = person.getPhones().stream().anyMatch(s -> s.contains(value));

			if (person.getName().contains(value) || person.getSurname().contains(value) || foundInAddresses
					|| foundInPhones) {
				result.add(person);
			}
		}
		return result;
	}

	public TreeSet<Person> sortBySurname() {
		Comparator<Person> comparatorBySurname = (p1, p2) -> p1.getSurname().compareTo(p2.getSurname());
		TreeSet<Person> newTreeSet = new TreeSet<>(comparatorBySurname);
		newTreeSet.addAll(people);
		return newTreeSet;
	}

}