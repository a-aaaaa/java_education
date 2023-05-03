package lr11.Example8;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(5);
        list.addLast(9);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.addFirst(7);
        list.remove(1);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(0);
    }
}
