package lr3;

import java.util.Scanner;
import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input array length n: ");
        int n = in.nextInt();
        int[] array = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        for (int i = 0; i < n; i++)
        {
            if (array[i] == minNum) {
                System.out.printf("Number: %d, Index: %d\n", minNum, i);
            }
        }
    }
}
