package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ramesh","Suresh","Ganesh","Kumar","Sukumar");

        List ascedingOrder=list.stream().sorted().collect(Collectors.toList());
        
        List descendingOrder=list.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());

        System.out.println("Ascending Order : "+ascedingOrder);
        System.out.println("Descending Order : "+descendingOrder);

    }
}
