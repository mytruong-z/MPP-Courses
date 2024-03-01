package prob2B;

public class OrderLine {
    private String OrderItemNo;
    private Order order;

    OrderLine(Order order, String orderItemNo) {
        this.order = order;
        this.OrderItemNo = orderItemNo;
    }

    public String getItemNo() {
        return OrderItemNo;
    }
}
