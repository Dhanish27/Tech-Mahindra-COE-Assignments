package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertAtFirstElement {
    public static void main(String[] args) {
        //List<String> colours = Arrays.asList("Red","Blue","Green");  // if you create list in this way you cannot modify its length
        List<String> colours = new ArrayList<>(Arrays.asList("Red","Blue","Green"));
        colours.add(0, "Purple");
        System.out.println(colours);
    }
}
