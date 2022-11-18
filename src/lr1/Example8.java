package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day: ");
        String day = in.next();

        System.out.println("Input month: ");
        String month = in.next();

        System.out.println("Input date: ");
        String date = in.next();

        System.out.printf("day: %s, date: %s, month: %s", day, date, month);
    }
}
