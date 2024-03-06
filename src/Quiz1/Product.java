package ThiNgocMyTruongQuizz;
import java.time.LocalDate;

public class Product {
    private Long productId;
    private String productName;
    private LocalDate dateSupplied;
    private int quantityInStock;
    private Double unitPrice;

    private Supplier supplier;

    public Product(Supplier sup, Long id, String name, LocalDate dateSupplied, int quantity, Double price) {
        this.productId = id;
        this.productName = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantity;
        this.unitPrice = price;
        this.supplier = sup;
    }

    public static Product newProduct(Supplier sup, Long id, String name, LocalDate dateSupplied, int quantity, Double price) {
        if (sup == null)
            throw new NullPointerException("Null supplier");

        return new Product(sup, id, name, dateSupplied, quantity, price);
    }

    public String getProductName() {
        return productName;
    }

    public Long getProductId() {
        return productId;
    }

    public LocalDate getDateSupplied() { return dateSupplied; }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public Double getUnitPrice() { return unitPrice; }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return String.format("Product{id=%d, name='%s', quantityInStock=%d, unitPrice=%.2f, dateSupplied=%s, supplier=%s}",
                productId, productName, quantityInStock, unitPrice, dateSupplied, supplier.getName());
    }
}
