package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = in.nextInt();
        if (num % 4 == 0 && num >= 10) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
