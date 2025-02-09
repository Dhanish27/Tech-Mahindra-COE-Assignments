package Assignment_2.WarehouseInventoryManagementSystem;

import java.util.Comparator;

public class OrderComparator implements Comparator<Order> {
    // This method gets used in PriorityQueue to compute the importance of the
    // thread

    /*
     * 1-0=1 -> order 1 first
     * 0-1=-1 -> order 2 first
     * 1-1 or 0-0 = 0 -> normal order
     */

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPriority().ordinal() - o1.getPriority().ordinal();
    }

}
