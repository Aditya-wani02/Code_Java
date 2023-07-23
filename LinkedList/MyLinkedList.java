

class Node{
    public int data;
    public Node next =null;
    
    
    public Node(int val){
        this.data = val;
    } 
}


public class MyLinkedList {
    private Node head;
    private Node tail;

    public MyLinkedList(){
        head =null;
        tail = null;

    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = tail = node;
        }
        else{
            tail.next = node;
            tail = node ;




        //     Node current = head;
        //     while( current.next != null){
        //         current=current.next;

        //     }
        //     current.next = node;
        }
    }
    
    public String toString(){
        Node current = head;
        StringBuilder result = new StringBuilder();

        while(current != null){
            result.append(current.data);
            if(current.next != null)
            result.append( " --> ");
            current = current.next;
        }
        return result.toString();

    }

    public int sum(){
        Node current = head;
        int sum =0;
        while(current != null){
            sum = sum+current.data;

            current = current.next;
        }
        return sum;
    }

    public int indexOf(int val){
        Node current = head;
        int index = 0;
        while(current != null){
            
            if(current.data == val)
            return index;
             
        index++;
            current = current.next;
        }
        return -1;

    }

}
