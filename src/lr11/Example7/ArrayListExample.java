package lr11.Example7;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }

        int index = 0;

        while (arrayList.size() > 1) {
            arrayList.remove(index);
            index = (index + 2) % arrayList.size();
        }

        System.out.println(arrayList);
    }
}
