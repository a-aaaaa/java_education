package lr4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input array height: ");
        int height = in.nextInt();
        System.out.println("Input array width: ");
        int width = in.nextInt();
        int[][] array = new int[height][width];
        int top = 0;
        int right = width - 1;
        int bottom = height - 1;
        int left = 0;
        int num = 10;
        while (bottom >= top && right >= left) {
            for (int j = left; j <= right; j++) {
                array[top][j] = num;
                num++;
            }
            top++;
            if (bottom < top) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                array[i][right] = num;
                num++;
            }
            right--;
            if (right < left) {
                break;
            }
            for (int j = right; j >= left; j--) {
                array[bottom][j] = num;
                num++;
            }
            bottom--;
            if (bottom < top) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                array[i][left] = num;
                num++;
            }
            left++;
            if (right < left) {
                break;
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
