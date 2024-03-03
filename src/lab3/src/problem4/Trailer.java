package lab3.src.problem4;

public class Trailer extends Property {
    private int RENT = 500;
    Trailer(int id, Address address) {
        super(id, address);
    }

    @Override
    public double computeRent() {
        return this.RENT;
    }
}
