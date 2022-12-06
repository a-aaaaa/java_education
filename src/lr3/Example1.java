package lr3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        switch (num) {
            case 1:
                System.out.println("Monday");
                return;
            case 2:
                System.out.println("Tuesday");
                return;
            case 3:
                System.out.println("Wednesday");
                return;
            case 4:
                System.out.println("Thursday");
                return;
            case 5:
                System.out.println("Friday");
                return;
            case 6:
                System.out.println("Saturday");
                return;
            case 7:
                System.out.println("Sunday");
                return;
        }
        System.out.println("Entered incorrect number");
    }
}
