package Generics;
import java.util.Objects;

public class GenericArrayCompare {
    public static<t> void arrayCompare(t arr1,t arr2){     // I am suing single generic type for single type comparison
        
        if(Objects.deepEquals(arr1, arr2)){
            System.out.println("equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
    public static void main(String[] args) {
        arrayCompare(new Integer[] {1,2,3}, new Float[] {1.0f,2.0f,3.0f});                               //this is for my understanding
        /* while passing it does not cause any error because the generic type <t> is erased during 
        runtime and Integer[], Float[] are treated as Object[] at runtime, allowing the method call without errors */

        arrayCompare(new Integer[] {1,2,3}, new Integer[] {1,2,3});                               

        arrayCompare(new Integer[] {1,2,3}, new Integer[] {1,3,2});

        arrayCompare(new Integer[] {1,2,3}, new Integer[] {1,2,3,4});

        
    }
}
