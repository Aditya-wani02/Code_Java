
public class MyStack {

    private int[] iteams;
    private int top;
    private int size;

    public MyStack(int size) {
        this.size = size;
        this.iteams = new int[size];
        this.top = 0;
    }

    public void push(int val) {
        if (top == size) {
            System.out.println("Stack is full");
            return;
        }

        this.iteams[this.top] = val;
        this.top++;
    }

    public int pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
            
        
        this.top--;
        int val = this.iteams[this.top];
        iteams[top] = 0;

        return val;
    }

       public int peek() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
    

        return this.iteams[this.top-1];
    }


    public int size() {
        return top;
    }

    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            sBuilder.append(iteams[i]).append("\n");

        }
        return sBuilder.toString();
    }
}
