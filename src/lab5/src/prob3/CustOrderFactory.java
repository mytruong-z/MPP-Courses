package lab5.src.prob3;

import java.time.LocalDate;

public class CustOrderFactory {
    public static Order newOrder(Customer cust, LocalDate orderNo) {
        if (cust == null) throw new NullPointerException("Null customer");
        Order ord = new Order(orderNo);
        cust.addOrder(ord);
        return ord;
    }
}
