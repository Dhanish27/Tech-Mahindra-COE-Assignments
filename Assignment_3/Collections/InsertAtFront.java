package Collections;

import java.util.LinkedList;

public class InsertAtFront {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original LinkedList: " + list);

        // Insert element at the front
        list.addFirst("Red");

        System.out.println("Updated LinkedList: " + list);
    }
}

