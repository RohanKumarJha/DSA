public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.peek();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.peek();
        System.out.println("The size of queue is "+q.size);
    }
}