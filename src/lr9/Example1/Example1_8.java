package lr9.Example1;

public class Example1_8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("2");
        } finally {
            System.out.println("1");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
