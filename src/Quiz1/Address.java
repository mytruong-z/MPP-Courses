package ThiNgocMyTruongQuizz;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private Supplier supplier;

    Address(Supplier supplier, String street, String city, String state, String zipCode) {
        supplier = supplier;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void addAddress(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getState() {
        return state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Supplier getSupplier() { return supplier; }

    @Override
    public String toString() {
        return "Address: " + street + ", " + city + ", " + state + ", " + zipCode;
    }
}
