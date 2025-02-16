package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        List<String> colours = new ArrayList<>(Arrays.asList("Red","Blue","Green","Purple"));
        colours.remove(3);
        System.out.println(colours);
    }
}
