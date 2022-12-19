package lr4;

public class Example2 {
    public static void main(String[] args) {
        int height = 8;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}
