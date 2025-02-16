package Collections;

import java.util.Arrays;
import java.util.List;

public class CopyArray {
    public static void main(String[] args) {
        List<String> colours = Arrays.asList("Red","Blue","Green");

        List<String> coloursCopy = colours;

        System.out.println(colours);
    }
}
