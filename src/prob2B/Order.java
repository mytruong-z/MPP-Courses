package prob2B;

import java.util.*;

public class Order {
    //Bidirectional with Multiplicities 1-1..many
    private List<OrderLine> orderLines = new ArrayList<>();
    private int orderNo;

    public Order(int num) {
        orderNo = num;
    }

    public void addOrderLine(String orderNo) {
        OrderLine item = new OrderLine(this, orderNo);
        orderLines.add(item);
    }
    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public int getOrderNo() {
        return orderNo;
    }


    @Override
    public String toString() {
        String result = "Order No: " + orderNo + "\n";
        for (OrderLine orderLine : orderLines) {
            result += "Order Item: " + orderLine.getItemNo() + "\n";
        }
        return result;

    }
}
