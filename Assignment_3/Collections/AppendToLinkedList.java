package Collections;

import java.util.LinkedList;

public class AppendToLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Original LinkedList: " + list);

        list.addLast("Mango"); // Appending an element at the end

        System.out.println("Updated LinkedList: " + list);
    }
}
