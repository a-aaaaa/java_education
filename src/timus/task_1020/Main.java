package timus.task_1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double r = in.nextDouble();
        double result = 2 * Math.PI * r;
        if (n > 1) {
            double[] x = new double[n + 1];
            double[] y = new double[n + 1];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextDouble();
                y[i] = in.nextDouble();
            }
            x[n] = x[0];
            y[n] = y[0];
            for (int i = 0; i < n; i++) {
                result += Math.sqrt((x[i + 1] - x[i]) * (x[i + 1] - x[i]) + (y[i + 1] - y[i]) * (y[i + 1] - y[i]));
            }
        }
        System.out.printf("%.2f", result);
    }
}
