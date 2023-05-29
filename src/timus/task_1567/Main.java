package timus.task_1567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int length = s.length();
        char[] cost1 = new char[]{'a', 'd', 'g', 'j', 'm', 'p', 's', 'v', 'y', ' ', '.', '_' };
        char[] cost2 = new char[]{'b', 'e', 'h', 'k', 'n', 'q', 't', 'w', 'z', ','};
        char[] cost3 = new char[]{'c', 'f', 'i', 'l', 'o', 'r', 'u', 'x', '!'};

        int cost = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);
            if (searchChar(currentChar, cost1)) cost++;
            else if (searchChar(currentChar, cost2)) cost += 2;
            else cost+= 3;
        }
        System.out.println(cost);
    }

    public static boolean searchChar(char ch, char[] chars) {
        for (char c : chars) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }
}
