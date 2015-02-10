import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {
	private static final long serialVersionUID = 1087263014794903618L;
	String name;
	String surname;
	String address;
	PhoneNumber number;

	public Person(String a, String b, String c, String d, String e, String f) {
		name = a;
		surname = b;
		address = c;
		number = new PhoneNumber(d, e, f);
	}

	public Person() {

	}

	public void changeName(String d) {
		name = d;
	}

	public void changeSurname(String e) {
		surname = e;
	}

	public void changeAddress(String f) {
		address = f;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getAddress() {
		return address;
	}

	public PhoneNumber getNumber() {
		return number;
	}

	@Override
	public int compareTo(Person person) {
		return name.compareTo(person.getName());
	}

	public String toString() {
		return name + "    " + surname + "    " + address
				+ "    " + number.toString();
	}

	public String write() {
		return name + "\r\n" + surname + "\r\n" + address + "\r\n"
				+ number.getHome() + "\r\n" + number.getCell() + "\r\n"
				+ number.getWork();
	}

}
