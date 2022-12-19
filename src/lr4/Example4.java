package lr4;

public class Example4 {
    public static void main(String[] args) {
        int n = 10;
        int[][] array = new int[n][];
        for (int i = 0; i < n; i++) {
            array[i] = new int[i + 1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
