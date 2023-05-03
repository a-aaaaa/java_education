package lr11.Example3;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static int[] array;
    public static void main(String[] args) {
        System.out.print("Input array size: ");
        array = new int[in.nextInt()];
        System.out.println("Input " + array.length + " integers separated by spaces:");
        fillArray(array.length - 1);
        printArray(array.length - 1);
    }

    public static void printArray(int index) {
        if (index != -1) {
            printArray(index - 1);
            System.out.print(array[index] + " ");
        }
    }

    public static void fillArray(int index) {
        if (index != -1) {
            fillArray(index - 1);
            array[index] = in.nextInt();
        }
    }
}
