public class Queue {
    private int[] arr = new int[5];
    private int size = 0;
    private int front = -1;
    private int rear = -1;

    public void enqueue(int elm) {
        if(size >= arr.length) {
            System.out.println("Stack Overflow....");
        } else {
            arr[size] = elm;
            if(size == 0) {
                front = 0; rear = 0;
            } else {
                rear++;
            } size++;
        }
    }

    public void dequeue() {
        if(size == 0) {
            System.out.println("Stack Underflow....");
        } else {
            if(size == 1) {
                front=-1; rear=-1;
            } else {
                front++;
            } size--;
        }
    }

    public void peek() {
        System.out.println(arr[front]);
    }

    public boolean isEmpty() {
        return (size == 0)?true:false;
    }

    public int size() {
        return size;
    }

    public void display() {
        int temp = front;
        while(temp <= rear) {
            System.out.print(arr[temp++]+" ");
        } System.out.println();
    }

}