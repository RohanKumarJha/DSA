import java.util.LinkedList;

public class Queue {
    ListNode head = null;
    ListNode temp = head;
    LinkedList<Integer> ll = new LinkedList<>();
    int front = -1;
    int rear = -1;
    int size = 0;

    public void enqueue(int data) {
        ListNode curr = new ListNode(data);
        if(head == null) {
            temp = curr;
            head = curr;
            front = 0;
            rear = 0;
        } else {
            temp.next = curr;
            temp = temp.next;
            rear++;
        } size++;
    }

    public void dequeue() {
        if(size == 0) {
            System.out.println("Stack Underflow....");
        } else if(size == 1) {
            head = null;
            front++;
            size--;
        } else {
            head = head.next;
            rear--;
            size--;
        }
    }

    public int peek() {
        return head.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0)?true:false;
    }

    public void display() {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        } System.out.println();
    }
}