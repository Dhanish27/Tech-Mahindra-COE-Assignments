package Assignment_2.WarehouseInventoryManagementSystem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Assignment_2.WarehouseInventoryManagementSystem.Order.Priority;

public class Main {
    Scanner scanner;
    InventoryManager inventoryManager;

    public Main() {
        scanner = new Scanner(System.in);
        inventoryManager = new InventoryManager();
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.run();

        // Product product1 = new Product("1111", "Laptop", 100, new Location(1, 2, 3));
        // Product product2 = new Product("2222", "Mobile Phone", 50, new Location(2, 3,
        // 4));

        // inventoryManager.addProduct(product1);
        // inventoryManager.addProduct(product2);

        // System.out.println(inventoryManager.searchProduct("1111"));
        // System.out.println(inventoryManager.updateStock("111", 1000));

        // Order order1 = new Order("1", Arrays.asList(new String[] { "1111", "2222" }),
        // Order.Priority.Standard);
        // Order order2 = new Order("2", Arrays.asList("2222"),
        // Order.Priority.Standard);

        // inventoryManager.addOrder(order1);
        // inventoryManager.addOrder(order2);

        // inventoryManager.processOrders();

        // System.out.println((inventoryManager.searchProduct("2222")).getQuantity());
    }

    public void run() {

        while (true) {

            System.out.println("Welcome to the Application : ");
            System.out.println("Enter 1 to Add Product ");
            System.out.println("Enter 2 to Search Product");
            System.out.println("Enter 3 to Add Order");
            System.out.println("Enter 4 to Update Stock");
            System.out.println("Enter 5 to Process Order");
            System.out.print("Enter Option : ");
            int option = scanner.nextInt();
            scanner.nextLine();
            /*
             * IMPORTANT : If we use nextInt before nextLine,
             * nextInt after getting a number leaves a empty line
             * which is \n which is consumed as an input to nextLine
             * which causes confusion in the flow of the program
             */
            switch (option) {
                case 1:
                    addProduct();
                    break;

                case 2:
                    searchProduct();
                    break;

                case 3:
                    addOrder();
                    break;

                case 4:
                    updateStock();
                    break;

                case 5:
                    processOrder();
                    break;

                default:
                    break;
            }
        }
    }

    public void addProduct() {
        String productID;
        String productName;
        int quantity;
        int aisle;
        int shelf;
        int binNumber;
        System.out.println("Enter Product ID: ");
        productID = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        productName = scanner.nextLine();
        System.out.print("Enter Product Quantity : ");
        quantity = scanner.nextInt();
        System.out.print("Enter Product Aisle : ");
        aisle = scanner.nextInt();
        System.out.print("Enter Shelf Number : ");
        shelf = scanner.nextInt();
        System.out.print("Enter Bin Number : ");
        binNumber = scanner.nextInt();

        Product product = new Product(productID, productName, quantity, new Location(aisle, shelf, binNumber));
        inventoryManager.addProduct(product);

        System.out.println("Product Added");
    }

    public void searchProduct() {
        System.out.println("Enter Product Id : ");
        String productID = scanner.nextLine();

        if (inventoryManager.searchProduct(productID) == null) {
            System.out.println("=====".repeat(10));
            System.out.println("Product Not Found!");
            System.out.println("=====".repeat(10));
        } else {
            System.out.println("=====".repeat(10));
            System.out.println("Product Details : ");
            Product productAddress = inventoryManager.searchProduct(productID);
            System.out.println("Product Name : " + productAddress.getName());
            System.out.println("Product ID : " + productAddress.getProductID());
            System.out.println("Product Quantity : " + productAddress.getQuantity());
            System.out.println("=====".repeat(10));
        }
    }

    public void addOrder() {
        String orderID;
        int productCount;
        List<String> productIDs = new ArrayList<String>();
        String priority;
        /*
         * using string instead of priority for comapring and
         * sending priority based on the input from the user
         */
        Order order;
        System.out.println("Enter Order ID : ");
        orderID = scanner.nextLine();
        System.out.println("Enter number of products : ");
        productCount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Product IDs : ");
        for (int i = 0; i < productCount; i++) {
            productIDs.add(scanner.nextLine());
        }
        System.out.println("Enter Priority (Standard/Premium)");
        priority = scanner.nextLine();
        if (priority.equals("Standard")) {
            order = new Order(orderID, productIDs, Priority.Standard);
        } else {
            order = new Order(orderID, productIDs, Priority.Premium);
        }
        inventoryManager.addOrder(order);
        System.out.println("Order Added Successfully");
    }

    public void updateStock() {
        String productID;
        Product productAddress;
        int newStockValue;
        System.out.println("Enter the Product ID : ");
        productID = scanner.nextLine();
        productAddress = inventoryManager.searchProduct(productID);
        System.out.println("Available Stock : " + productAddress.getQuantity());
        System.out.println("Enter New Stock Value : ");
        newStockValue = scanner.nextInt();
        scanner.nextLine();
        productAddress.setQuantity(newStockValue);
        System.out.println("Stock Value Successfully Updated");
    }

    public void processOrder() {
        inventoryManager.processOrders();

    }
}
