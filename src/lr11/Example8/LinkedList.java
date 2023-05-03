package lr11.Example8;

public class LinkedList {
    Node head = null;
    Node tail = null;

    static class Node {
        int value;
        Node next;

        Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int value) {
        Node newNode = new Node(value, null);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int value) {
        Node newNode = new Node(value, null);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFirst() {
        head = head.next;
    }

    public void removeLast() {
        Node currentNode = head;
        while (currentNode.next != tail) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        tail = currentNode;
    }

    public void remove(int index) {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("The list is empty!");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node previousNode = null;
        int i = 0;
        while (currentNode != null) {
            if (i == index) {
                previousNode.next = currentNode.next;
                break;
            }
            else {
                previousNode = currentNode;
                currentNode = currentNode.next;
                i++;
            }
        }
        if (currentNode == null) {
            System.out.println("Element not found!");
        }
    }

    public String toString() {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("The list is empty!");
            return "";
        }
        StringBuilder result = new StringBuilder();
        while (currentNode.next != null) {
            result.append(currentNode.value).append(", ");
            currentNode = currentNode.next;
        }
        result.append(currentNode.value);
        return result.toString();
    }
}
