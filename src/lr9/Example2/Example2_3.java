package lr9.Example2;

public class Example2_3 {
    public static int findSum(byte[] bytes) {
        int sum = 0;
        int bytesLength = bytes.length;
        for (int i = 0; i < bytesLength; i++) {
            sum += bytes[i];
        }
        if (sum < -128 || sum > 127) {
            throw new ArithmeticException("Result is outside the byte type range");
        }
        return sum;
    }
    public static void main(String[] args) {
        byte[] bytes = {126, 3};
        try {
            int sum = findSum(bytes);
            System.out.println(sum);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
