package Streams;

import java.util.Arrays;
import java.util.List;

public class MinMaxElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Max : " + list.stream().mapToInt(Integer::intValue).max().getAsInt());
        System.out.println("Min : " + list.stream().mapToInt(Integer::intValue).min().getAsInt());

    }
}
