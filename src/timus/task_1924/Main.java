package timus.task_1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 1;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                result += (i + 1);
            }
            else {
                result -= (i + 1);
            }
        }
        if (result % 2 != 0) {
            System.out.println("grimy");
        }
        else {
            System.out.println("black");
        }
    }
}
