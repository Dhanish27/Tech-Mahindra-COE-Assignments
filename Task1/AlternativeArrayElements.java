package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlternativeArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int[] inputs = new int[scanner.nextInt()];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextInt();
        }

        List<Integer> alternativeCopies = new ArrayList<>();

        for (int i = 0; i < inputs.length; i = i + 2) {
            if (i < inputs.length) {
                alternativeCopies.add(inputs[i]);
            }
        }
        System.out.println(alternativeCopies);
    }
}
