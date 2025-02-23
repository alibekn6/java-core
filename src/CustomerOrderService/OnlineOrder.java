package CustomerOrderService;
import CustomerOrderService.CustomerOrder;
import CustomerOrderService.Address;
import CustomerOrderService.Enums.DeliveryStatus;
import CustomerOrderService.Enums.DeliveryZone;
import CustomerOrderService.Enums.OrderStatus;

import java.time.LocalDate;

public class OnlineOrder extends CustomerOrder {
    private final Address address;
    private final String trackingNumber;
    private LocalDate estimatedDeliveryTime;
    private DeliveryStatus deliveryStatus;

    public OnlineOrder(Customer customer, Address address, String trackingNumber) {
        super(customer);
        this.address = address;
        this.trackingNumber = trackingNumber;
        this.deliveryStatus = DeliveryStatus.ORDER_PLACED;
        calculateEstimatedDeliveryTime();
    }

    private void calculateEstimatedDeliveryTime() {
        int additionalDays = 0;
        if (address.getZone() == DeliveryZone.RURAL) {
            additionalDays = 2;
        } else if (address.getZone() == DeliveryZone.SUBURBAN) {
            additionalDays = 1;
        }
        // urban = 0;
        this.estimatedDeliveryTime = LocalDate.now().plusDays(2 + additionalDays);
    }

    // used more modern variant
}
