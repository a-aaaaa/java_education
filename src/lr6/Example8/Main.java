package lr6.Example8;

public class Main {
    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{3, 0, 4, -2, 0}));
        System.out.println(findAverage(new int[]{1, 2, 3, 4, 5}));
        System.out.println(findAverage(new int[]{1, 3, 4, 2}));
    }

    public static double findAverage(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}
