package Generics;
import java.util.Arrays;
import java.util.List;

public class EvenOddSum {
    public static<t extends Number> void evenOddSum(List<t> list){
        int evenSum=0;
        int oddSum=0;

        for(t element:list){
            int num=element.intValue();
            if(num%2==0){
                evenSum=evenSum+num;
            }
            else{
                oddSum=oddSum+num;
            }
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
    public static void main(String[] args) {
        evenOddSum(Arrays.asList(1,2,3,4,5));
    }
}

    