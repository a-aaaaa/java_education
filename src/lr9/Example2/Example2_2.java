package lr9.Example2;

import java.util.Random;
import java.util.Scanner;

public class Example2_2 {
    public static void findColumn(int columnIndex, int[][] matrix){
        int matrixHeight = matrix.length;
        for (int i = 0; i < matrixHeight; i++) {
            System.out.print(matrix[i][columnIndex - 1] + " ");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int matrixWidth = 4;
        int matrixHeight = 5;
        int[][] matrix = new int[matrixHeight][matrixWidth];
        for (int i = 0; i < matrixHeight; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                matrix[i][j] = random.nextInt(0,10);
            }
        }
        for (int i = 0; i < matrixHeight; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int columnIndex;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input column number: ");
        try {
            columnIndex = Integer.parseInt(scanner.nextLine());
            findColumn(columnIndex, matrix);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input format");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No column with this index");
        }
    }
}
