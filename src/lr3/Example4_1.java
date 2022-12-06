package lr3;

import java.util.Scanner;

public class Example4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        int maxNum = Math.max(num1, num2);
        for (int i = Math.min(num1, num2); i <= maxNum; i++) {
            System.out.println(i);
        }
    }
}
