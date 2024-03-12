package lesson9.demo.actice_exercise_lambdas_streams.quizclasses;

public class Address {
	private String street, city, state, zip;
	public Address(String s, String c, String state, String zip) {
		this.street = s;
		this.city = c;
		this.state = state;
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
}
