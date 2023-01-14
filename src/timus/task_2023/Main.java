package timus.task_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] cases = {"APOR", "BMS", "DGJKTW"};
        char firstLetter;
        int steps = 0;
        int currentCase = 0;
        for (int i = 0; i < n; i++) {
            firstLetter = in.nextLine().charAt(0);
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k < cases[j].length(); k++) {
                    if (cases[j].charAt(k) == firstLetter) {
                        steps += Math.abs(j - currentCase);
                        currentCase = j;
                        break;
                    }
                }
            }
        }
        System.out.println(steps);
    }
}
