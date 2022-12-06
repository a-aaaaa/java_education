package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input array length n: ");
        int n = in.nextInt();
        Random rnd = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
