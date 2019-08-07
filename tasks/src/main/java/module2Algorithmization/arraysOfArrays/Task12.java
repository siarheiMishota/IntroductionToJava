package module2Algorithmization.arraysOfArrays;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int n = 0;
        int[][] a,ascend,descend;
        String s = "Input array's size n-even   number";

        a=getSquareArray(s);

        System.out.println("original array:");
        printArray(a);
        System.out.println();

        System.out.println("the array is sorted in ascending order:");
        ascend=sortAscending(a);
        printArray(ascend);
        System.out.println();

        System.out.println("the array is sorted in descending order:");
        descend=sortDescending(a);
        printArray(descend);



    }

    private static int[][] sortAscending(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a[0].length - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int tmp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = tmp;
                    }
                }
            }
        }
        return a;
    }

    private static int[][] sortDescending(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a[0].length - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (a[i][k] < a[i][k + 1]) {
                        int tmp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = tmp;
                    }
                }
            }
        }
        return a;
    }

    private static int getIntValue(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    private static int[][] getSquareArray(String s) {
        int n = 0;
        int[][] a;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = getIntValue(scanner, "Input the number " + i + "*" + j);
            }
        }
        return a;
    }

    private static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(String.format("%3d ", a[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
