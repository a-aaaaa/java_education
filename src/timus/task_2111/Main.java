package timus.task_2111;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int currentWeight = 0;
        long tax = 0;
        int[] roads = new int[n];
        for (int i = 0; i < n; i++) {
            roads[i] = in.nextInt();
            currentWeight += roads[i];
        }
        Arrays.sort(roads);
        for (int i = 0; i < n; i++) {
            tax += roads[i] * (2L * currentWeight - roads[i]);
            currentWeight -= roads[i];
        }
        System.out.println(tax);
    }
}
