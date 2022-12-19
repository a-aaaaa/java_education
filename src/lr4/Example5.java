package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int width = 5;
        int height = 3;
        int[][] array = new int[height][width];
        Random rnd = new Random();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print((array[i][j] = rnd.nextInt(10)) + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] newArray = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print((newArray[i][j] = array[j][i]) + " ");
            }
            System.out.println();
        }
    }
}
