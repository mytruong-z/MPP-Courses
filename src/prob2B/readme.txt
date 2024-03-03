In this approach, Order owns the relationship
between Order and OrderLine. Since at least 1
OrderLine is required when Order is created,
constructor of Order calls addOrderLine once;
the method is available for additional order lines
as well.

Note that the addOrderLine method maintains the
relationship. Using a setter instead to 
keep a reference to Order in each new OrderLine 
is prone to error.

It is possible to violate the relationship as it
has been implemented here by
creating an instance of OrderLine directly:
  new OrderLine(lineNum, price, quantity, null)
For this reason, we make it so that the OrderLine constructor
has only package level access.