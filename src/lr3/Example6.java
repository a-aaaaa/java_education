package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Entered incorrect array length");
            return;
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (5 * i) + 2;
            System.out.print(array[i] + " 1");
        }
    }
}
