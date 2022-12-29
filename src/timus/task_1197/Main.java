package timus.task_1197;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] tile = new int[n][2];
        int[][] dir = {{2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}};
        int coveredTiles;
        for (int i = 0; i < n; i++) {
            char[] input = in.next().toCharArray();
            tile[i][0] = input[0] - 'a';
            tile[i][1] = input[1] - '0';
        }
        for (int j = 0; j < n; j++) {
            coveredTiles = 0;
            for (int i = 0; i < 8; i++) {
                if (tile[j][0] + dir[i][0] >= 0 && tile[j][0] + dir[i][0] < 8 && tile[j][1] + dir[i][1] > 0 && tile[j][1] + dir[i][1] <= 8) {
                    coveredTiles++;
                }
            }
            out.println(coveredTiles);
        }
        out.flush();
    }
}
