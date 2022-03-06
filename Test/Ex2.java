package Test;

import Ex1.Matrix;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[][] matrix10 = new int[10][10];
        int[][] matrix40 = new int[40][40];
        for (int i = 0; i < matrix40.length; i++) {
            for (int j = 0; j < matrix40.length; j++) {
                matrix40[i][j] = 1;
            }
        }
        for (int i = 0; i < matrix10.length; i++) {
            for (int j = 0; j < matrix10.length; j++) {
                matrix40[i][j] = 1;
            }
        }
        System.out.println(checkMatrix(matrix40, matrix10));

    }

    public static boolean checkMatrix(int[][] matrix40, int[][] matrix10) {
        for (int i = 0; i < matrix40.length - matrix10.length + 1; i++) {
            for (int j = 0; j < matrix40[0].length - matrix10[0].length + 1; j++) {
                boolean finish = true;
                for (int k = 0; k < matrix10.length; k++) {
                    for (int m = 0; m < matrix10[0].length; m++) {
                        if (matrix40[i + k][j + m] != matrix10[k][m]) {
                            finish = false;
                            break;
                        }
                    }
                    if (!finish) break;
                }
                if (finish) return true;
            }
        }
        return false;
    }
}
