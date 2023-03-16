package lr9.Example2;

import java.util.Scanner;

public class Example2_1 {
    public static double findAverage(int[] numArray) {
        int arrayLength = numArray.length;
        double sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (numArray[i] > 0) {
                sum += numArray[i];
            }
        }
        if (sum == 0) {
            throw new IllegalArgumentException();
        }
        return sum / arrayLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integers separated by space: ");
        String[] input = scanner.nextLine().split(" ");
        int inputLength = input.length;
        int[] numArray = new int[inputLength];
        try {
            for (int i = 0; i < inputLength; i++) {
                numArray[i] = Integer.parseInt(input[i]);
            }
            System.out.println(findAverage(numArray));
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input format");
        } catch (IllegalArgumentException e) {
            System.out.println("No positive numbers in array");
        }
    }
}
