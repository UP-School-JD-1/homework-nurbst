package Ch9_course2_h3;

import java.util.ArrayList;

public class Person implements Comparable<Person> {
	private String name;
	private String surname;
	private ArrayList<String> addresses;
	private ArrayList<String> phones;
	
	public Person(String name,String surname,ArrayList<String> addresses,ArrayList<String> phones) {
		this.name=name;
		this.surname=surname;
		this.addresses=addresses;
		this.phones=phones;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ArrayList<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(ArrayList<String> addresses) {
		this.addresses = addresses;
	}

	public ArrayList<String> getPhones() {
		return phones;
	}

	public void setPhones(ArrayList<String> phones) {
		this.phones = phones;
	}
	
	@Override
	public int hashCode() {
		return getName().hashCode()+getSurname().hashCode();
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if(getClass() != o.getClass()) return false;
	
		Person person=(Person) o;
		if(getSurname().equals(person.getSurname())) {
			return getName().equals(person.getSurname());
		}
		return false;
	}
	
	@Override
	public String toString() {
        return name + " " + surname + " " + addresses.toString() + " " + phones.toString();
    }
	
	@Override
    public int compareTo(Person o) {
        if (getSurname().equals(o.getSurname()) && getName().equals(o.getName())) return 0;
        else if (getSurname().equals(o.getSurname())) return getName().compareTo(o.getName());
        return getSurname().compareTo(o.getSurname());
    }
}