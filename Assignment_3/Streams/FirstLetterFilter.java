package Streams;

import java.util.Arrays;
import java.util.List;

public class FirstLetterFilter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ramesh","Suresh","Ganesh","Kumar","Sukumar");
        String firstChar="S";
        System.out.println(list.stream().filter(s->s.startsWith(firstChar)).count());
    }
}
