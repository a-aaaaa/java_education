package lr3;

public class Example8 {
    public static void main(String[] args) {
        int n = 10;
        char[] array = new char[n];
        char currentChar;
        int count = 0;
        int i = 0;
        while (count < n) {
            currentChar = (char) ('A' + i);
            if (currentChar == 'A' || currentChar == 'E' || currentChar == 'I') {
                i++;
                continue;
            }
            array[count] = currentChar;
            System.out.print(array[count] + " ");
            count++;
            i++;
        }
    }
}
