package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input age: ");
        int age = in.nextInt();

        int currentYear = 2022;
        int birthYear = currentYear - age;

        System.out.println("Your birth year: " + birthYear);
    }
}
