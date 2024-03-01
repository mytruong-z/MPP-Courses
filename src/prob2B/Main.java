package prob2B;

public class Main {
    //Bidirectional with Multiplicities 1-1..many
    public static void main(String[] args) {
        Order order = new Order(1);
        order.addOrderLine("N1");
        order.addOrderLine("N2");
        order.addOrderLine("N3");
        System.out.println(order);

        Order order2 = new Order(2);
        order2.addOrderLine("M1");
        order2.addOrderLine("M2");
        order2.addOrderLine("M3");
        System.out.println(order2);
    }
}
