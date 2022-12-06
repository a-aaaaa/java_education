package lr3;

import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input day of the week: ");
        String day = in.nextLine().toLowerCase();
        switch (day) {
            case "monday":
                System.out.println("1");
                return;
            case "tuesday":
                System.out.println("2");
                return;
            case "wednesday":
                System.out.println("3");
                return;
            case "thursday":
                System.out.println("4");
                return;
            case "friday":
                System.out.println("5");
                return;
            case "saturday":
                System.out.println("6");
                return;
            case "sunday":
                System.out.println("7");
                return;
        }
        System.out.println("Entered incorrect day");
    }
}
