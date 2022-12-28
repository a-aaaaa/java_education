package lr6.Example4;

public class Main {
    public static void main(String[] args) {
        System.out.println(findDoubleFactorial(6));
        System.out.println(findDoubleFactorial(5));
        System.out.println(findDoubleFactorialRecursive(6));
        System.out.println(findDoubleFactorialRecursive(5));
    }

    public static int findDoubleFactorial(int n) {
        int factorial = n;
        while (n > 2) {
            n -= 2;
            factorial *= n;
        }
        return factorial;
    }

    public static int findDoubleFactorialRecursive(int n) {
        if (n > 2) {
            return n * findDoubleFactorial(n - 2);
        }
        return n;
    }
}
