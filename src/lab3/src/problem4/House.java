package lab3.src.problem4;

public class House extends Property {
    private float lotSize;
    float RENT_PER_SQFT = 0.1f;

    public House(int id, Address address, float lotSize) {
        super(id, address);
        this.lotSize = lotSize;
    }

    public float getLotSize() {
        return lotSize;
    }

    public void setLotSize(float lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return this.RENT_PER_SQFT * lotSize;
    }
}
