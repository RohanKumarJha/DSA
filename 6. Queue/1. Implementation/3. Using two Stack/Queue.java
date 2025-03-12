import java.util.Stack;

public class Queue {
    int size = 0;
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void enqueue(int data) {
        st1.push(data);
        size++;
    }

    public void dequeue() {
        while(!st1.isEmpty()) {
            st2.push(st1.pop());
        } st2.pop();
        while(!st2.isEmpty()) {
            st1.push(st2.pop());
        } size--;
    }

    public int peek() {
        while(!st1.isEmpty()) {
            st2.push(st1.pop());
        } 
        int result = st2.peek();
        while(!st2.isEmpty()) {
            st1.push(st2.pop());
        } return result;
    }

    public boolean isEmpty() {
        return (st1.isEmpty())?true:false;
    }

    public int size() {
        return size;
    }

    public void display() {
        while(!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        while(!st2.isEmpty()) {
            System.out.print(st2.peek()+" ");
            st1.push(st2.pop());
        } System.out.println();
    }

}