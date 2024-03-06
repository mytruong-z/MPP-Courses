package ThiNgocMyTruongQuizz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SRMAppMain {
    public static void main(String[] args) {
        Supplier supplier = new Supplier("SS0013", "Argos Fruit Supplies", "(641) 451-0098", "1000 N Main Street", "Fairfield", "IA", "52556-0001", 3128874119L, "Banana", LocalDate.of(2023, 1, 1), 123, 1.99);
        supplier.addNewProduct(3128874119L, "Banana", LocalDate.of(2023, 1, 1), 123, 1.99);
        supplier.addNewProduct(3128874119L, "Apple", LocalDate.of(2023, 1, 1), 123, 1.99);

        List<Product> products = new ArrayList<Product>();
        products.addAll(supplier.getProducts());

        //Create array Product
        Product[] productArray = new Product[products.size()];
        int i = 0;
        for (Product product: products) {
            productArray[i++] = product;
        }

        //Print out the products
        System.out.println("Products: ");
        int j = 0;
        for (Product product: productArray) {
            System.out.printf("%d. %s\n", j++, product);
        }
    }
}
