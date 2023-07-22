public class Main {
    public static void main(String[] args) {
        MyArray arr = new MyArray(15);

        arr.insert(14);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(10);

        System.out.println(arr);
        arr.reverse();
        System.out.println(arr);
        // System.out.println(arr.indexOf(0));
        // arr.removeAt(5);
        // arr.insert(12);
        // System.out.println(arr.max());
        // System.out.println(arr.min());

    }
}
