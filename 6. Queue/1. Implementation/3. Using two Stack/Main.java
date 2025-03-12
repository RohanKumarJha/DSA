
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.display();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.display();
        System.out.println("The size of queue is "+queue.size());
        System.out.println("The peek element is "+queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.display();
        System.out.println("The size of queue is "+queue.size());
        System.out.println("The peek element is "+queue.peek());
    }
}
