package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int width = 6;
        int height = 5;
        Random rnd = new Random();
        int[][] array = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print((array[i][j] = rnd.nextInt(10)) + " ");
            }
            System.out.println();
        }
        System.out.println();
        int deleteRow = rnd.nextInt(width);
        int deleteColumn = rnd.nextInt(height);
        int[][] newArray = new int[height - 1][width - 1];
        int row = 0;
        int col;
        for (int i = 0; i < height - 1; i++) {
            col = 0;
            if (i == deleteRow) {
                row++;
            }
            for (int j = 0; j < width - 1; j++) {
                if (j == deleteColumn) {
                    col++;
                }
                System.out.print((newArray[i][j] = array[i + row][j + col]) + " ");
            }
            System.out.println();
        }
    }
}
