package Assignment9.Problem2;

public class NodeStack {
    public static class Node {
        Object val;
        Node next;
        Node(Object val){
            this.val = val;
        }
    }

    private Node head;
    private int size = 0;

    public void push(Object item){
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Object poppedItem = head.val;
        head = head.next;
        size--;
        return poppedItem;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public Object peek(){
        if(isEmpty()){
            return null;
        }
        return head.val;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        NodeStack stack = new NodeStack();
        stack.push(20);
        stack.push(10);
        stack.push("Alpha");
        stack.push("Henry");
        System.out.println("Popped item " + stack.pop());
        System.out.println("Stack Size " + stack.size);
        System.out.println("Popped item " + stack.pop());
        System.out.println("Popped item " + stack.pop());
        System.out.println("Popped item " + stack.pop());
        System.out.println("Popped item " + stack.pop());
        System.out.println("Stack Size " + stack.size);
    }

}
