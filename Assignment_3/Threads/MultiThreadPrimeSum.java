package Threads;

import java.util.ArrayList;
import java.util.List;

class PrimeSumThread extends Thread {
    private int start, end;
    private long sum = 0;

    public PrimeSumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    public long getSum() {
        return sum;
    }
}

public class MultiThreadPrimeSum {
    public static void main(String[] args) {
        int N = 100;  // Limit (Change this value as needed)
        int numThreads = 4;  // Number of threads
        int range = N / numThreads;

        List<PrimeSumThread> threads = new ArrayList<>();
        int start = 1;

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            int end = (i == numThreads - 1) ? N : start + range - 1;
            PrimeSumThread thread = new PrimeSumThread(start, end);
            threads.add(thread);
            thread.start();
            start = end + 1;
        }

        // Collect results from all threads
        long totalSum = 0;
        for (PrimeSumThread thread : threads) {
            try {
                thread.join();
                totalSum += thread.getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of all prime numbers up to " + N + " is: " + totalSum);
    }
}
