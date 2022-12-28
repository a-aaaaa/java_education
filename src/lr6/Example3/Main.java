package lr6.Example3;

public class Main {
    public static void main(String[] args) {
        int min = Math1.findMin(12, 3, 11, 0 ,-13, 13, 33);
        System.out.println(min);
        int[] numArray = {12, 3, 11, 0 ,-13, 13, 33};
        int min1 = Math1.findMin(numArray);
        System.out.println(min1);
        int max = Math1.findMax(12, 3, 11, 0 ,-13, 13, 33);
        System.out.println(max);
        double average = Math1.findAverage(1, 2, 3, 4);
        System.out.println(average);
    }
}
