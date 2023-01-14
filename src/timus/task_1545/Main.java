package timus.task_1545;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = in.nextLine();
        }
        char firstLetter = (in.nextLine().charAt(0));
        for (int i = 0; i < n; i++) {
            if (strings[i].charAt(0) == firstLetter) {
                System.out.println(strings[i]);
            }
        }
    }
}
