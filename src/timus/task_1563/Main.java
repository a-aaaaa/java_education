package timus.task_1563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] shops = new String[n];
        for (int i = 0; i < n; i++) {
            shops[i] = in.nextLine();
        }
        String currentShop;
        int result = 0;
        for (int i = 0; i < n; i++) {
            currentShop = shops[i];
            for (int j = i; j < n; j++) {
                if (j == i) {
                    continue;
                }
                if (currentShop.equals(shops[j])) {
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
