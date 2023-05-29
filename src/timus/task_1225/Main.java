package timus.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long result = 1;
        long previous = 1;
        long temp;
        for (int i = 2; i < n; i++) {
            temp = result;
            result += previous;
            previous = temp;
        }
        System.out.println(2 * result);
    }
}
