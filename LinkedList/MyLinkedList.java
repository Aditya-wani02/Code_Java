
class Node {
    public int data;
    public Node next = null;

    public Node(int val) {
        this.data = val;
    }
}

public class MyLinkedList {
    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;

    }

    public void insert(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;

            // Node current = head;
            // while( current.next != null){
            // current=current.next;

            // }
            // current.next = node;
        }
    }

    public String toString() {
        Node current = head;
        StringBuilder result = new StringBuilder();

        while (current != null) {
            result.append(current.data);
            if (current.next != null)
                result.append(" --> ");
            current = current.next;
        }
        return result.toString();

    }

    public int sum() {
        Node current = head;
        int sum = 0;
        while (current != null) {
            sum = sum + current.data;

            current = current.next;
        }
        return sum;
    }

    public int indexOf(int val) {
        Node current = head;
        int index = 0;
        while (current != null) {

            if (current.data == val)
                return index;

            index++;
            current = current.next;
        }
        return -1;

    }

    public void insertInBegin(int val) {
        Node n = new Node(val);
        if (isEmpty()) {
            insert(val);
        }

        n.next = head;
        head = n;

    }

    public boolean isEmpty() {
        return head == null && tail == null;

    }

    public void insertAt(int index, int val) {
        if (isEmpty())
            throw new IllegalArgumentException();
        Node node = new Node(val);
        Node current = head, previous = null;

        while (index > 0 && current != null) {
            previous = current;
            current = current.next;
            index--;
        }
        previous.next = node;
        node.next = current;

    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while (next != null) {
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        head = current;
        current.next = prev;
    }

    public void deleteFirst() {
        if (isEmpty())
            return;

        Node temp = head;
        head = head.next;
        temp.next = null;

    }

    public void deletelast() {
        if (isEmpty())
            return;

        Node prev = null;
        Node next = head;

        while (next.next != null) {

            prev = next;
            next = next.next;
        }
        prev.next = null;

    }

}
