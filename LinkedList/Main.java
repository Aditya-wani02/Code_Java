
public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        // System.out.println(list.indexOf(1));
        // System.out.println(list.sum());
        System.out.println((list));
        list.insertInBegin(10);
        list.insertInBegin(10);
        System.out.println(list);

    }

}