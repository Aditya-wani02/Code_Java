import java.util.Queue;
import java.util.Stack;
import java.util.ArrayDeque;



public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue);
        while(!queue.isEmpty())
        stack.push(queue.poll());

        // stack.push(queue.poll());
        // stack.push(queue.poll());
        // stack.push(queue.poll());
        // stack.push(queue.poll());

        while(! stack.isEmpty())
        queue.offer(stack.pop());

        
        // queue.offer(stack.pop());
        // queue.offer(stack.pop());
        // queue.offer(stack.pop());
        // queue.offer(stack.pop());



        System.out.println(queue);
        // System.out.println(queue.poll());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.peek());

        
    }
}
