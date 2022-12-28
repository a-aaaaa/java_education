package lr6.Example7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'x', 'y', 'z'};
        int[] codes = convertToCodes(chars);
        System.out.println(Arrays.toString(codes));
    }

    public static int[] convertToCodes(char[] chars) {
        int length = chars.length;
        int[] codes = new int[length];
        for (int i = 0; i < length; i++) {
            codes[i] = chars[i];
        }
        return codes;
    }
}
