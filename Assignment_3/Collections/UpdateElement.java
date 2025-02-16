package Collections;

import java.util.Arrays;
import java.util.List;

public class UpdateElement {
    public static void main(String[] args) {
        List<String> colours = Arrays.asList("Red","Blue","Green");
        colours.set(1,"Yellow");
        System.out.println(colours);
    }
}
