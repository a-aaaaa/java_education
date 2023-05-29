package timus.task_1585;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> penguins = new HashMap<>();
        penguins.put("Emperor Penguin", 0);
        penguins.put("Little Penguin", 0);
        penguins.put("Macaroni Penguin", 0);
        for (int i = 0; i < n; i++) {
            penguins.merge(in.nextLine(), 1, Integer::sum);
        }
        int counter = -1;
        String result = "";
        for (Map.Entry<String, Integer> set : penguins.entrySet()) {
            if (set.getValue() > counter) {
                result = set.getKey();
                counter = set.getValue();
            }
        }
        System.out.println(result);
    }
}
