package lab5.src.prob3.extpackage;

import lab5.src.prob3.CustOrderFactory;
import lab5.src.prob3.Order;
import lab5.src.prob3.Customer;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		Order order = CustOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");
		order.addItem("Pants");
		System.out.println(order);

		Customer cust2 = new Customer("Bob2");
		Order order2 = CustOrderFactory.newOrder(cust2, LocalDate.now());
		order2.addItem("Pencil");
		order2.addItem("Notebook");
		order2.addItem("Backpack");
		System.out.println(order2);
	}
}

		
