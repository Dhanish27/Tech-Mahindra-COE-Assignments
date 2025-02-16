package Collections;

import java.util.LinkedList;
import java.util.Iterator;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        for (String color : list) {
            System.out.println(color);
        }

       
    }
}

