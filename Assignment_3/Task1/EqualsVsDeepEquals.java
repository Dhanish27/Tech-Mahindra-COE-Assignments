package Task1;

import java.util.Objects;

public class EqualsVsDeepEquals {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };

        

        System.out.println("Deep Equals (arrays): " + Objects.deepEquals(arr1, arr2));      // checks inner elements
        System.out.println("Equals (arrays): " + Objects.equals(arr1, arr2));      //checks address
    }
}
