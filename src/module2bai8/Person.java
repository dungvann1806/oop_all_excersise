package module2bai8;

public class Person {
	protected String lastName;
	protected String firstName;

	public Person() {
		super();
		this.lastName = "chua co";
		this.firstName = "chua co";
	}

	public Person(String lastName, String firstName) {
		super();
		setLastName(lastName);
		setFirstName(firstName);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName.equalsIgnoreCase("")?"chua co": lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName.equalsIgnoreCase("")?"chua co": firstName;
	}
	
	public String toString() {
		return String.format("%-10s%-10%", lastName, firstName);
	}

}
