package timus.task_1025;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] groups = new int[n];
        for (int i = 0; i < n; i++) {
            groups[i] = in.nextInt();
        }
        Arrays.sort(groups);
        int result = 0;
        for (int i = 0; i < Math.ceil(n / 2.0); i++) {
            result += Math.ceil(groups[i] / 2.0);
        }
        System.out.println(result);
    }
}
