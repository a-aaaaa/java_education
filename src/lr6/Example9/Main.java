package lr6.Example9;

public class Main {
    public static void main(String[] args) {
        char[] chars1 = {'a', 'b', 'c', 'd'};
        char[] chars2 = {'a', 'b', 'c', 'd', 'e'};
        switchElements(chars1);
        switchElements(chars2);
        System.out.println(chars1);
        System.out.println(chars2);
    }

    public static void switchElements(char[] chars) {
        int length = chars.length;
        char temp;
        for (int i = 0; i < length / 2; i++) {
            temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
    }
}
