package lr6.Example10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = findMaxAndMin(0, 10, 133, -3, 0);
        int[] arr2 = findMaxAndMin(-124, -123, -123, -2, 0);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] findMaxAndMin(int... num) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : num) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return new int[] {max, min};
    }
}
