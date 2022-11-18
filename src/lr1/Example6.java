package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input last name: ");
        String lastName = in.nextLine();

        System.out.println("Input patronymic: ");
        String patronymic = in.nextLine();

        System.out.printf("Hello %s %s %s", lastName, name, patronymic);
    }
}
