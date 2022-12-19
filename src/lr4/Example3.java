package lr4;

public class Example3 {
    public static void main(String[] args) {
        int width = 20;
        int height = 8;
        int[][] array = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = 2;
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
