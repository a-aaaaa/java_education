package timus.task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int cars = 0;
        for (int i = 0; i < n; i++) {
            cars += in.nextInt() - k;
            if (cars < 0) {
                cars = 0;
            }
        }
        System.out.println(cars);
    }
}
