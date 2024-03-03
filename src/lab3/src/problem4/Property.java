package lab3.src.problem4;

public abstract class Property {
    private int id;
    private Address address;

    public Property(int id, Address address) {
        this.id = id;
        this.address = address;
    }
    public abstract double computeRent();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
