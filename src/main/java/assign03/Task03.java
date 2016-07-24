package assign03;

/* INFO 2313 - SUMMER 2016
 * ASSIGNMENT 3
 *
 * Student Name :
 * Student Number : */

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

    public static int size;

    public static int[] multPoly(int[] A, int[] B) {

        int[][] pairs = new int[size][size];

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; i++) {
                pairs[i][j] = A[i] * B[j];
            }
        }

        int[] C = new int[2 * size - 1];

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; i++) {
                C[i + j] = C[i + j] + pairs[i][j];
            }
        }

        return C;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        size = scanner.nextInt();

        int[] A = new int[size];
        int[] B = new int[size];
        System.out.print("Enter coefficients of A: ");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print("Enter coefficients of B: ");
        for (int i = 0; i < size; i++) {
            B[i] = scanner.nextInt();
        }

        int[] D = multPoly(A, B);

        System.out.println(Arrays.toString(D));
    }
}
