package Collections;

import java.util.LinkedList;

public class InsertFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original LinkedList: " + list);

        // Insert at the first position
        list.addFirst("Red");

        // Insert at the last position
        list.addLast("Purple");

        System.out.println("Updated LinkedList: " + list);
    }
}

