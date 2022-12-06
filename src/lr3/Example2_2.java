package lr3;

import java.util.Scanner;

public class Example2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input day of the week: ");
        String day = in.nextLine().toLowerCase();
        if (day.equals("monday")) {
           System.out.println("1");
           return;
        }
        if (day.equals("tuesday")) {
            System.out.println("2");
            return;
        }
        if (day.equals("wednesday")) {
            System.out.println("3");
            return;
        }
        if (day.equals("thursday")) {
            System.out.println("4");
            return;
        }
        if (day.equals("friday")) {
            System.out.println("5");
            return;
        }
        if (day.equals("saturday")) {
            System.out.println("6");
            return;
        }
        if (day.equals("sunday")) {
            System.out.println("7");
            return;
        }
        System.out.println("Entered incorrect day");
    }
}
