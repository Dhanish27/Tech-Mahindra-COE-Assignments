package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class InsertMultipleAtPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original LinkedList: " + list);

        // Elements to insert
        List<String> newElements = Arrays.asList("Purple", "Orange");

        // Specified position
        int position = 2;

        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position!");
        } else {
            list.addAll(position, newElements);
            System.out.println("Updated LinkedList: " + list);
        }
    }
}

