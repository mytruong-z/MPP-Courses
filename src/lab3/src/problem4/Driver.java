package lab3.src.problem4;

public class Driver {
	public static void main(String[] args) {
		Property[] properties = new Property[3];
		properties[0] = new House(1, new Address("5th Ave", "Fairfield", "Iowa", "52557"), 1000);
		properties[1] = new Condo(2, new Address("6th Ave", "Fairfield", "Iowa", "52557"), 3);
		properties[2] = new Trailer(3, new Address("7th Ave", "Fairfield", "Iowa", "52557"));

		new Landlord("John", properties);
		System.out.println(Admin.computeTotalRent(properties));
	}
}
