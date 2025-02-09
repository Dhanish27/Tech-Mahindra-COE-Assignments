package Assignment_2.WarehouseInventoryManagementSystem;

import java.util.Comparator;

public class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPriority().ordinal() - o1.getPriority().ordinal();
    }
}
