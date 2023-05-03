package lr11.Example2;

public class Main {
    public static void main(String[] args) {
        System.out.println(ConvertToBinary(-2));
    }

    public static String ConvertToBinary(int num) {
        if (num == 0 || num == 1) {
            return "" + num;
        }
        return (ConvertToBinary(num / 2) + "" + num % 2);
    }
}
