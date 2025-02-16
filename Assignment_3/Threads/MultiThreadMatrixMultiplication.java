package Threads;

import java.util.Arrays;

class MatrixMultiplicationThread extends Thread {
    private int row;
    private int[][] A, B, result;

    public MatrixMultiplicationThread(int row, int[][] A, int[][] B, int[][] result) {
        this.row = row;
        this.A = A;
        this.B = B;
        this.result = result;
    }

    public void run() {
        int colsB = B[0].length;
        int colsA = A[0].length;
        for (int j = 0; j < colsB; j++) {
            result[row][j] = 0;
            for (int k = 0; k < colsA; k++) {
                result[row][j] += A[row][k] * B[k][j];
            }
        }
    }
}

public class MultiThreadMatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible!");
            return;
        }

        int[][] result = new int[rowsA][colsB];
        Thread[] threads = new Thread[rowsA];

        for (int i = 0; i < rowsA; i++) {
            threads[i] = new MatrixMultiplicationThread(i, A, B, result);
            threads[i].start();
        }

        for (int i = 0; i < rowsA; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}

