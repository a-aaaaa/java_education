package lr6.Example3;

public class Math1 {
    public static int findMin(int... num) {
        int min = Integer.MAX_VALUE;
        for (int i : num) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int findMax(int... num) {
        int max = Integer.MIN_VALUE;
        for (int i : num) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static double findAverage(int... num) {
        double sum = 0;
        int numCount = 0;
        for (int i : num) {
            sum += i;
            numCount++;
        }
        return sum / numCount;
    }
}
