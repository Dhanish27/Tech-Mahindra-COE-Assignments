package Threads;

import java.util.Arrays;

class SortThread extends Thread {
    private int[] arr;

    public SortThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        Arrays.sort(arr); // Sorting the array in the thread
    }

    public int[] getSortedArray() {
        return arr;
    }
}

public class MultiThreadSorting {
    public static void main(String[] args) {
        int[] array = {12, 7, 3, 9, 14, 6, 11, 2};
        int mid = array.length / 2;

        // Divide array into two halves
        int[] leftHalf = Arrays.copyOfRange(array, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(array, mid, array.length);

        // Create two sorting threads
        SortThread thread1 = new SortThread(leftHalf);
        SortThread thread2 = new SortThread(rightHalf);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Merge the sorted halves
        int[] sortedArray = merge(thread1.getSortedArray(), thread2.getSortedArray());

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;
    }
}
