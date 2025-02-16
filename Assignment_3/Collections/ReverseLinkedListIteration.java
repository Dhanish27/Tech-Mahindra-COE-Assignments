package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Purple");

        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.println("Iterating in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
