package ThiNgocMyTruongQuizz;

import java.time.LocalDate;
import java.util.*;
public class Supplier {
    //Make the Association between Product and Supplier, Unidirectional. (1-0..*)
    private String number;
    private String name;
    private String contactPhoneNumber;

    private ArrayList<Product> products;

    private Address primaryAddress;

    public Supplier(String supNo, String supName, String supPhone, String street, String city, String state, String zip, Long firstProductId, String firstProductName, LocalDate dateSupplied, Integer quantity, Double unitPrice) {
        this.number = supNo;
        this.name = supName;
        this.contactPhoneNumber = supPhone;
        this.primaryAddress = new Address(this, street, city, state, zip);
        if (this.products == null) {
            this.products = new ArrayList<>();
        }

        this.products.add(new Product(this, firstProductId, firstProductName, dateSupplied, quantity, unitPrice ));
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setNumber(String number) { this.number = number; }

    public void setName(String name) { this.name = name; }

    public void setContactPhoneNumber(String phone) { this.contactPhoneNumber = phone; }

    public Address getAddress() {
        return primaryAddress;
    }

    public Product addNewProduct(Long id, String name, LocalDate dateSupplied, int quantity, Double price) {
        Product product = new Product(this, id, name, dateSupplied, quantity, price);
        products.add(product);
        return product;
    }

    public List<Product> getProducts() { return products; }
}
