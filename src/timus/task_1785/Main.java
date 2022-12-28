package timus.task_1785;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        if (a >= 1 && a <= 4) {
            out.println("few");
        } else if (a >= 5 && a <= 9) {
            out.println("several");
        } else if (a >= 10 && a <= 19) {
            out.println("pack");
        } else if (a >= 20 && a <= 49) {
            out.println("lots");
        } else if (a >= 50 && a <= 99) {
            out.println("horde");
        } else if (a >= 100 && a <= 249) {
            out.println("throng");
        } else if (a >= 250 && a <= 499) {
            out.println("swarm");
        } else if (a >= 500 && a <= 999) {
            out.println("zounds");
        } else {
            out.println("legion");
        }

        out.println();
        out.flush();
    }
}
