public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.peek();
        q.poll();
        System.out.println("The size of queue is "+q.size);
    }
}