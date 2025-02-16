package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ramesh","Suresh","Ganesh","Kumar");
        List<String> listUpperCase=list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(listUpperCase);
    }
}
