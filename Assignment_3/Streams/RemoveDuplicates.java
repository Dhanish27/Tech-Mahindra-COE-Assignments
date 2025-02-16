package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,1,1,1);

        List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
    }
}
