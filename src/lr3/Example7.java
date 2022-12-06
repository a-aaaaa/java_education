package lr3;

public class Example7 {
    public static void main(String[] args) {
        int n = 10;
        char[] array = new char[n];
        for (int i = 0; i < n; i++) {
            array[i] = (char) ('a' + (i * 2));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
