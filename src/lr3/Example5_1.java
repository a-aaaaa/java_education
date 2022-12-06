package lr3;

import java.util.Scanner;

public class Example5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input sum numbers count n: ");
        int n = in.nextInt();
        int num = 0;
        int sum = 0;
        while (n > 0) {
            if (num % 5 == 2 || num % 3 == 1) {
                System.out.println(num);
                n--;
                sum += num;
            }
            num++;
        }
        System.out.println(sum);
    }
}
