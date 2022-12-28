package lr6.Example6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 4, 2, -1, -32, 0};
        System.out.println(Arrays.toString(array));
        int[] newArray = makeNewArray(array, 3);
        System.out.println(Arrays.toString(newArray));
        int[] newArray1 = makeNewArray(array, 10);
        System.out.println(Arrays.toString(newArray1));
    }

    public static int[] makeNewArray(int[] array, int n) {
        if (n >= array.length) {
            return Arrays.copyOf(array, array.length);
        }
        return Arrays.copyOfRange(array, 0, n);
    }
}
