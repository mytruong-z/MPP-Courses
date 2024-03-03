package lesson2.labsolns.prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Implementing 1..*
public class Order {
	private LocalDate dateOfOrder; 
	private List<OrderLine> orderLines;
	public Order(LocalDate dateOfOrder, int lineNum, double price, int quantity) {
		this.dateOfOrder = dateOfOrder;
		orderLines = new ArrayList<>();
		addOrderLine(lineNum, price, quantity);
		
	}
	public void addOrderLine(int lineNum, double price, int quantity){
		orderLines.add(new OrderLine(lineNum, price, quantity, this));
	}
	@Override
	public String toString() {
		String msg = "Order: \n";
		for(OrderLine o : orderLines) {
			msg += o.toString() + "\n";
		
		}
		return msg;
	}
}
