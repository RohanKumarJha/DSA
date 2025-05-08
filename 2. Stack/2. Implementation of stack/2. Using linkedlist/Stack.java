import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> ll = new LinkedList<>();
    ListNode head = null;
    ListNode tail = null;
    int size = 0;

    public void push(int i) {
        ListNode curr = new ListNode(i);
        if(size == 0) {
            head = curr;
            tail = curr;
        } else {
            tail.next = curr;
            tail = curr;
        } size++;
    }

    public void pop() {
        ListNode curr = head;
        if(size == 0) {
            System.out.println("Stack is empty, you cannot delete element from empty stack");
        } else if(size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            while(curr.next != tail) {
                curr = curr.next;
            } curr.next = curr.next.next;
            tail = curr;
            size--;
        }
    }

    public void peek() {
        System.out.println(tail.data);
    }

}
