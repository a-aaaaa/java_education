package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input text to encode: ");
        String plainText = in.nextLine();
        System.out.print("Input key: ");
        int key = in.nextInt();
        in.nextLine();
        int inputLength = plainText.length();
        char[] cipherText = plainText.toCharArray();
        for (int i = 0; i < inputLength; i++) {
            char currentChar = plainText.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                if (Character.isLowerCase(currentChar)) {
                    cipherText[i] = (char) ((currentChar - 'a' + key) % 26 + 'a');
                }
                else {
                    cipherText[i] = (char) ((currentChar - 'A' + key) % 26 + 'A');
                }
            }
        }
        System.out.print("Encoded text: " + new String(cipherText) + "\n");
        System.out.print("Decipher text? (y/n): ");
        String ans = in.nextLine();
        if (!ans.equals("y") && !ans.equals("n")) {
            System.out.println("Incorrect answer!");
            return;
        }
        if (ans.equals("n")) {
            System.out.println("Goodbye!");
            return;
        }
        for (int i = 0; i < inputLength; i++) {
            if (Character.isAlphabetic(cipherText[i])) {
                if (Character.isLowerCase(cipherText[i])) {
                    cipherText[i] = (char) ((cipherText[i] - 'z' - key) % 26 + 'z');
                }
                else {
                    cipherText[i] = (char) ((cipherText[i] - 'Z' - key) % 26 + 'Z');
                }
            }
        }
        System.out.println("Deciphered text: " + new String(cipherText));
    }
}
