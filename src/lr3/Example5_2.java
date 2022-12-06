package lr3;

import java.util.Scanner;

public class Example5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input sum numbers count n: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; n > 0; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                sum += i;
                n--;
            }
        }
        System.out.println(sum);
    }
}
