package lr6.Example5;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(findSumOfSquares(n));
        System.out.println(findSumOfSquaresRecursive(n));
        System.out.println(findSumOfSquaresFormula(n));
    }

    public static int findSumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static int findSumOfSquaresRecursive(int n) {
        if (n > 0) {
            return findSumOfSquaresRecursive(n - 1) + (n * n);
        }
        return n;
    }

    public static int findSumOfSquaresFormula(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }
}
