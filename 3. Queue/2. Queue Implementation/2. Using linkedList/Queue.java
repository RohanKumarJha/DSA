import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> ll = new LinkedList<>();
    ListNode head = null;
    ListNode tail = null;
    int size = 0;

    public void offer(int i) {
        ListNode curr = new ListNode(i);
        if(head == null) {
            head = curr;
            tail = curr;
        } else {
            tail.next = curr;
            tail = tail.next;
        } size++;
    }

    public void peek() {
        if(head == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(head.data);
        }
    }

    public void poll() {
        if(head == null) {
            System.out.println("Queue is empty");
        } else if(head.equals(tail)) {
            head = null;
            tail = null;
            size--;
        } else {
            head = head.next;
            size--;
        }
    }

}
