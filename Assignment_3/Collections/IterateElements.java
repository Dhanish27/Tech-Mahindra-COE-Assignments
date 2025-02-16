package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateElements {
    public static void main(String[] args) {
        List<String> colours = Arrays.asList("Red","Blue","Green");
        for(String colour:colours){
            System.out.println(colour);
        }

    }
}
