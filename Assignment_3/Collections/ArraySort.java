package Collections;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        List<String> colours = Arrays.asList("Red","Blue","Green");
        colours.sort(null);
        System.out.println(colours);
    }
}
