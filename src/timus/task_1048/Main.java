package timus.task_1048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] result = new char[n + 1];
        int carryoverCounter = 0;
        result[0] = '0';
        for (int i = 1; i < n + 1; i++) {
            int num = in.nextInt() + in.nextInt();
            if (num == 9) {
                result[i] = (char)(num + '0');
                carryoverCounter++;
            }
            else if (num < 9) {
                result[i] = (char)(num + '0');
                carryoverCounter = 0;
            }
            else {
                result[i] = (char)(num % 10 + '0');
                carryoverCounter++;
                for (int j = i - 1; j > i - 1 - carryoverCounter; j--) {
                    result[j] = (char)((result[j] - '0' + 1) % 10 + '0');
                }
                carryoverCounter = 0;
            }
        }
        if (result[0] == '0') {
            System.out.println(new String(result, 1, n));
        }
        else {
            System.out.println(new String(result));
        }
    }
}
