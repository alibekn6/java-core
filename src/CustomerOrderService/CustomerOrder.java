package CustomerOrderService;

import CustomerOrderService.Enums.OrderStatus;

import java.time.LocalDate;
import java.util.UUID;

public class CustomerOrder {

    private final String orderId;
    private final Customer customer;
    private final LocalDate orderDate;
    private OrderStatus status;

    public CustomerOrder(Customer customer) {
        this.orderId = UUID.randomUUID().toString();
        this.customer = customer;
        this.orderDate = LocalDate.now();
        this.status = OrderStatus.PENDING;
    }

    String getOrderId() {
        return orderId;
    }

    Customer getCustomer() {
        return customer;
    }

    LocalDate getOrderDate() {
        return orderDate;
    }

    OrderStatus getStatus() {
        return status;
    }

    protected void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Order ID: %s, Customer: %s, Date: %s, Status: %s",
                orderId, customer.getName(), orderDate, status);
    }

}

