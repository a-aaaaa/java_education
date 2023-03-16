package lr9.Example1;

public class Example1_12 {
    public static void m(String str, double num) {
        try {
            if (str == null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
            if (num > 0.001) {
                throw new IllegalArgumentException("Неверное число");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("1" + e);
        }
    }

    public static void main(String[] args) {
        m("3", 0.1);
    }
}
