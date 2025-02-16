package Task1;

import java.util.Arrays;

public class ArrayCopyRangeFunction {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};

        int[] arr2 = Arrays.copyOfRange(arr1, 0, 3);

        System.out.println(Arrays.toString(arr2));

    }
}
