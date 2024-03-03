package lab3.src.problem4;

public class Condo extends Property {
    private int numberOfFloors;
    private int RENT_PER_FLOOR = 400;

    public Condo(int id, Address address, int numberOfFloors) {
        super(id, address);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double computeRent() {
        return this.RENT_PER_FLOOR * numberOfFloors;
    }
}
