package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("\n" + "Numbers before: " + "\n");
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }
        System.out.println("\n" + "Numbers after: " + "\n");
        List<Integer> integersAfter = findLesserThan(50, integers);
        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> findLesserThan(int num, List<Integer> integers) {
        return integers.stream()
                .filter(x -> x < num)
                .collect(Collectors.toList());
    }
}