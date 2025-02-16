package Streams;

import java.util.Arrays;
import java.util.List;

public class EvenOddSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int oddsum=list.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();

        int evensum=list.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();

        System.out.println("Odd Sum : "+oddsum);
        System.out.println("Even Sum : "+evensum);

    }
}
