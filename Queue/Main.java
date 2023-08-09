
public class Main {

    public static void main(String[] args) {

       MyQueue queue = new MyQueue(10);
    //  QueueUsingStack queue = new QueueUsingStack();

       queue.pri_enqueue(5);
       queue.pri_enqueue(22);
       queue.pri_enqueue(3);
       queue.pri_enqueue(7);
       queue.pri_enqueue(1);
       
        System.out.println(queue);
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
       queue.pri_enqueue(43);
       queue.pri_enqueue(2);
       queue.pri_enqueue(6);
       System.out.println(queue);
      System.out.println(queue.dequeue());
      System.out.println(queue.dequeue());
      System.out.println(queue.dequeue());
       System.out.println(queue);
    }

}

