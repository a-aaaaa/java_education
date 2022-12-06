package lr3;

import java.util.Scanner;

public class Example4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        int maxNum = Math.max(num1, num2);
        int minNum = Math.min(num1, num2);
        while (minNum != maxNum + 1) {
            System.out.println(minNum);
            minNum++;
        }
    }
}
