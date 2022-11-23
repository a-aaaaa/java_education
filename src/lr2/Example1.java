package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = in.nextInt();
        if (num % 3 == 0) {
            System.out.println("Number is divisible by 3");
        }
        else {
            System.out.println("Number is not divisible by 3");
        }
    }
}
