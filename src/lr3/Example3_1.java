package lr3;

import java.util.Scanner;

public class Example3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input sequence length n: ");
        int n = in.nextInt();
        int previousNumber = 0;
        int currentNumber = 1;
        int tempNumber;

        for (int i = 0; i < n; i ++) {
            System.out.println(currentNumber);
            tempNumber = currentNumber;
            currentNumber += previousNumber;
            previousNumber = tempNumber;
        }
    }
}
