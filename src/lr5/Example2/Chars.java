package lr5.Example2;

public class Chars {
    char start = 'a';
    char end = 'z';

    public void print() {
        for (int i = start; i <= end; i++) {
            System.out.print((char) i);
        }
    }
}
