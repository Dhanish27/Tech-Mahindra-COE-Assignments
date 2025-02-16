package Collections;

import java.util.Arrays;
import java.util.List;

public class SearchElement {
    public static void main(String[] args) {
        List<String> colours = Arrays.asList("Red","Blue","Green","Yellow");
        int i=0;
        for(String colour:colours){
            if(colour.equals("Green")){
                System.out.println("Index : "+i);
            }
            i++;
        }
    }
}
