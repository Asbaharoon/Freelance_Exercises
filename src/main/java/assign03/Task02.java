package assign03;

import static java.lang.Math.*;

/* INFO 2313 - SUMMER 2016
 * ASSIGNMENT 3
 *
 * Student Name :
 * Student Number : */

public class Task02 {

    private static final int MIN = 1;
    private static final int MAX = 6;

    private static int ONE;
    private static int TWO;
    private static int THREE;
    private static int FOUR;
    private static int FIVE;
    private static int SIX;

    public static void die_experiment(int n) {
        for (int i = 0; i < n; i++) {
            int d = (int) (floor(random() * (MAX - MIN + 1)) + MIN);
            count(d);
        }
        print();
    }

    public static void count(int number) {
        switch (number) {
            case 1:
                ONE += 1;
                break;
            case 2:
                TWO += 1;
                break;
            case 3:
                THREE += 1;
                break;
            case 4:
                FOUR += 1;
                break;
            case 5:
                FIVE += 1;
                break;
            case 6:
                SIX += 1;
                break;
            default:
                System.out.println("Wrong number!");
                break;
        }
    }

    public static void print() {
        System.out.print("[1]: ");
        while (ONE > 0) {
            System.out.print("*");
            ONE--;
        }
        System.out.println();
        System.out.print("[2]: ");
        while (TWO > 0) {
            System.out.print("*");
            TWO--;
        }
        System.out.println();
        System.out.print("[3]: ");
        while (THREE > 0) {
            System.out.print("*");
            THREE--;
        }
        System.out.println();
        System.out.print("[4]: ");
        while (FOUR > 0) {
            System.out.print("*");
            FOUR--;
        }
        System.out.println();
        System.out.print("[5]: ");
        while (FIVE > 0) {
            System.out.print("*");
            FIVE--;
        }
        System.out.println();
        System.out.print("[6]: ");
        while (SIX > 0) {
            System.out.print("*");
            SIX--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        die_experiment(100);
    }
}
