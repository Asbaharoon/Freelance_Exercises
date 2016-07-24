package assign03;

import java.util.Arrays;

/* INFO 2313 - SUMMER 2016
 * ASSIGNMENT 3
 *
 * Student Name :
 * Student Number : */

public class Task01 {

    public static int[] find(int[] array, int target) {

        int[] results = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target)
                results[i] = 1;
            else results[i] = 0;
        }
        return results;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 3, 2, 1};
        int[] B = find(A, 3);
        System.out.println("B = " + Arrays.toString(B));

        int[] C = find(A, 2);
        System.out.println("C = " + Arrays.toString(C));

        int[] D = find(A, 1);
        System.out.println("D = " + Arrays.toString(D));
    }
}
