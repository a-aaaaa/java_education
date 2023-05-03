package lr11.Example6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char[] chars = new char[random.nextInt(2, 10)];
            for (int j = 0; j < chars.length; j++) {
                chars[j] = (char)random.nextInt('a', 'z');
            }
            hashMap.put(random.nextInt(0, 10), new String(chars));
        }

        List<String> stringList = new ArrayList<>();
        int keysMultiplied = 1;
        System.out.println(hashMap);

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            if (value.length() > 5) {
                keysMultiplied *= key;
            }

            if (key == 0) {
                for (String str : stringList) {
                    System.out.print(str + " ");
                }
                System.out.println();
                continue;
            }

            if (key > 5) {
                stringList.add(value);
            }
        }
        System.out.println("\n" + keysMultiplied);
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
