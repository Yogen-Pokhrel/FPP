package Assignment9.Problem1;

public class ArrayQueueImpl {
    private int[] arr = new int[4];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
       return arr[front];
    }

    public void enqueue(int obj) {
        if(isFull()){
            resizeAndReArrange();
        }
        arr[rear++] = obj;
        if(front == -1){
            front = 0;
        }
    }

    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front++];
    }

    public boolean isEmpty() {
        return front == rear || rear == 0;
    }

    private boolean isFull() {
        return rear == arr.length - 1;
    }

    public int size() {
        return front >= 0 ? rear - front : 0;
    }

    //if rearrangement is not required this method can be used to resize the queue
    private void resize() {
        int len = arr.length;
        int newLen = len * 2;
        int[] newArray = new int[newLen];
        System.arraycopy(arr, 0, newArray, 0, len);
        arr = newArray;
    }

    public void display(){
        StringBuilder s = new StringBuilder("Queue [");
        if(isEmpty()){
            s.append("empty");
        }else{
            s.append("Front ");
            s.append(arr[front]);
            for(int i = front + 1; i < rear; i++){
                s.append(" -> ");
                s.append(arr[i]);
            }
            s.append(" Rear");
        }
        s.append("]");
        System.out.println(s);
    }

    //utilize the space before front
    private void resizeAndReArrange() {
        int len = arr.length;
        int newLen = len * 2;
        int[] newArray = new int[newLen];
        if(!(front == -1 || front == 0)){
            System.arraycopy(arr, front, newArray, 0, rear - front);
            rear = rear - front;
            front = 0;
        }else{
            System.arraycopy(arr, 0, newArray, 0, len);
        }
        arr = newArray;
    }

    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);
        queue.enqueue(17);
        System.out.println("Queue Size :" + queue.size());
        System.out.println("Dequeue " + queue.dequeue());
        System.out.println("Dequeue " + queue.dequeue());
        System.out.println("Dequeue " + queue.dequeue());
        System.out.println("Dequeue " + queue.dequeue());
        queue.enqueue(18);
        queue.enqueue(19);
        queue.enqueue(21);
        queue.enqueue(22);
        System.out.println("Queue Size :" + queue.size());
        queue.display();
    }
}
