
public class Main {

    public static void main(String[] args) {

        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        stack.pop();
        stack.pop();
        // stack.pop();

        // stack.push(8);
        // System.out.println(stack.pop());
        System.out.println(stack.peek());

        // System.out.println(stack.size());
        System.out.println("-------------");
        System.out.println(stack);

    }

}

