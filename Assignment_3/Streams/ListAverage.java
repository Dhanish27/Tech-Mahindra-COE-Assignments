package Streams;

import java.util.Arrays;
import java.util.List;

public class ListAverage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(list.stream().mapToInt(i->i.intValue()).average());    //unboxing wrapper to primitive and computing average

        System.out.println(list.stream().mapToInt(Integer :: intValue).average());  
        /*we use ::  instead of lambda function for which the syntax is "classname :: methodName" for eg: (System.out::println) no need () bracket */

        System.out.println(list.stream().mapToInt(Integer::intValue).average().getAsDouble());  
        // average returns a class object from the class object to get average value we use another method

    }
}
