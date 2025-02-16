package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Purple");

        int startIndex = 2; 

        if (startIndex < 0 || startIndex >= list.size()) {
            System.out.println("Invalid starting position.");
            return;
        }

        ListIterator<String> iterator = list.listIterator(startIndex);

        System.out.println("Iterating from index " + startIndex + ":");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

