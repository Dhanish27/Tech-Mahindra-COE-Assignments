package Assignment_2.WarehouseInventoryManagementSystem;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import java.util.PriorityQueue;

public class InventoryManager {
    private Map<String, Product> products; // Thread-safe inventory storage
    private PriorityQueue<Order> orderQueue; // Priority queue for orders

    public InventoryManager() {
        products = new ConcurrentHashMap<>();
        orderQueue = new PriorityQueue<>(new OrderComparator()); // Initialize order queue
    }

    public synchronized void addProduct(Product product) {
        if (!products.containsKey(product.getProductID())) {
            products.put(product.getProductID(), product);
            System.out.println("Product added: " + product.getName());
        } else {
            System.out.println("Product already exists! Updating stock...");
            Product existingProduct = products.get(product.getProductID());
            existingProduct.setQuantity(existingProduct.getQuantity() + product.getQuantity());
        }
    }

    public Product searchProduct(String productID) {
        return products.get(productID); // Returns Product object if found, otherwise null
    }

    public boolean updateStock(String productID, int newQuantity) {
        Product product = products.get(productID);
        if (product != null) {
            if (newQuantity < 0) {
                throw new IllegalArgumentException("Stock quantity cannot be negative.");
            }
            product.setQuantity(newQuantity);
            return true; // Stock updated successfully
        }
        return false; // Product not found
    }

    public void addOrder(Order order) {
        orderQueue.offer(order);
        System.out.println("Order added: " + order.getOrderId());
    }

    public void processOrders() {
        ExecutorService executor = Executors.newFixedThreadPool(5); // Thread pool with 5 threads

        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll(); // Get the highest-priority order
            if (order != null) {
                executor.execute(() -> processSingleOrder(order)); // Process each order in a separate thread
            }
        }

        executor.shutdown(); // Shut down the executor after processing all orders
        try {
            /*
             * put the main threads to stop working until the worker threads get processed
             */
            executor.awaitTermination(Long.MAX_VALUE /* wait until all the worker thread get processed */,
                    TimeUnit.NANOSECONDS/* periodic time period where it checks whether all threads are processed */); // Wait
                                                                                                                       // for
                                                                                                                       // all
                                                                                                                       // tasks
                                                                                                                       // to
                                                                                                                       // finish
        } catch (InterruptedException e) {
            /*
             * if any thread is interrupted the below method does not cause run time error
             * but it informs other threads about the error occured amoung this threads
             */
            /*
             * for example stop the main method execution using ctrl c and see the terminal
             */
            Thread.currentThread().interrupt();
        }

        System.out.println("All orders processed successfully.");
    }

    private void processSingleOrder(Order order) {
        System.out.println("Processing order: " + order.getOrderId());

        for (String productID : order.getProductIDs()) {
            Product product = products.get(productID);
            if (product != null && product.getQuantity() > 0) {
                product.setQuantity(product.getQuantity() - 1);
                System.out.println(
                        "Product " + product.getName() + " dispatched. Remaining stock: " + product.getQuantity());
            } else {
                System.out.println("Product " + productID + " is out of stock!");
            }
        }
    }
}
