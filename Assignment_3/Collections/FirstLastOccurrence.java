package Collections;

import java.util.LinkedList;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.add("Blue");

        System.out.println("LinkedList: " + list);

        // Element to find occurrences of
        String target = "Blue";

        // Getting first and last occurrence indexes
        int firstIndex = list.indexOf(target);
        int lastIndex = list.lastIndexOf(target);

        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + target + "' at index: " + firstIndex);
            System.out.println("Last occurrence of '" + target + "' at index: " + lastIndex);
        } else {
            System.out.println("'" + target + "' is not found in the list.");
        }
    }
}

