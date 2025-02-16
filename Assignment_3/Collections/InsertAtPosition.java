package Collections;

import java.util.LinkedList;

public class InsertAtPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original LinkedList: " + list);

        int position = 2; // Index where the element should be inserted (0-based)
        String newElement = "Purple";

        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position!");
        } else {
            list.add(position, newElement);
            System.out.println("Updated LinkedList: " + list);
        }
    }
}

