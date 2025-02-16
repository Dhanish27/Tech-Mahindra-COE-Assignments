package Generics;

import java.util.Arrays;
import java.util.List;;

public class TargetElementIndex {
    public static <t extends Number> void searchIndex(List<t> list, t target) {
        for (int i = 0; i < list.size(); i++) {
            if ((target.intValue()) == (list.get(i).intValue())) { // unboxing Integer type to to primitive int
                System.out.println("Index : " + i);
                return;
            }
        }
        System.out.println("Element Not Found");
    }

    public static void main(String[] args) {
        searchIndex(Arrays.asList(1, 2, 3, 4, 5), 3);
    }
}
