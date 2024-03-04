package lab4.src.prob4C;

public class Order {
    private String orderNo;
    private double orderAmount;

    private Commissioned commissioned;

    public Order(String orderNo, double orderAmount) {
        this.orderNo = orderNo;
        this.orderAmount = orderAmount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Commissioned getCommissioned() {
        return commissioned;
    }

    public void setCommissioned(Commissioned commissioned) {
        this.commissioned = commissioned;
    }
}
