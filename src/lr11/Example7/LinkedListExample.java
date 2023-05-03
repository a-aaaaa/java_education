package lr11.Example7;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        int n = 10;
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }

        int index = 0;

        while (linkedList.size() > 1) {
            linkedList.remove(index);
            index = (index + 2) % linkedList.size();
        }

        System.out.println(linkedList);
    }
}
