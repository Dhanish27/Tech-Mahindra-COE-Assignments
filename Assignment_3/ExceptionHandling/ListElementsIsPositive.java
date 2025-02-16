package ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PositiveNumberException extends Exception{
    public PositiveNumberException(String errorMessage){
        super(errorMessage);
    }
}

public class ListElementsIsPositive {
    public static void addElement(int element) throws PositiveNumberException{
        if(element>=0){
            throw new PositiveNumberException(String.format("Entered Number %d is positive",element));
        }
        
    }
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(-1,-2,3,-4);
        List<Integer> l2=new ArrayList<>();

        for(int element:l1){
            try{
                addElement(element);
                l2.add(element);
            }
            catch(PositiveNumberException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(l2);
    }
}
