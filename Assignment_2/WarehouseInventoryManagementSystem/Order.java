package Assignment_2.WarehouseInventoryManagementSystem;

import java.util.List;

public class Order {
    enum Priority {
        Standard, Premium;
    }

    private String orderId;
    private List<String> productIDs;
    private Priority priority;

    Order(String orderId, List<String> productIDs, Priority priority) {
        this.orderId = orderId;
        this.productIDs = productIDs;
        this.priority = priority;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<String> getProductIDs() {
        return productIDs;
    }

    public Priority getPriority() {
        return priority;
    }
}
