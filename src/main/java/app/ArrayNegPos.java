package app;

import java.util.Random;
import java.util.Scanner;

public class ArrayNegPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int index = 0;
        int positive = 0;
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] copyArray = new int[n];
        for (int row = 0; row < n; row++) {
            array[row] = rand.nextInt(10 + 10 + 1) - 10;
            copyArray[row] = array[row];
            if (array[row] > 0) {
                positive = array[row];
                index = row;
            }
        }
        int k = index;
        int replace = 0;
        for (int i = index - 1; i > 0; i--) {
            if (array[i] > 0) {
                replace = array[i];
                array[i] = positive;
                positive = replace;
            }
        }
        array[k] = positive;
        for (int h = 0; h < n; h++) {
            System.out.print(copyArray[h] + " ");
        }
        System.out.println();
        for (int j = 0; j < n; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
