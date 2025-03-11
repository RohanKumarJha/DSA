public class Stack {
    ListNode head = null;
    ListNode temp = head;
    int length = 0;

    public void push(int data) {
        ListNode curr = new ListNode(data);
        if(head == null) {
            head = curr;
            temp = curr;
        } else {
            temp.next = curr;
            temp = temp.next;
        } length++;
    }

    public void peek() {
        if(length == 0) {
            System.out.println("Null Pointer Exception.........");
        } 
        ListNode curr = head;
        int i=0;
        while(i < length-1) {
            curr = curr.next;
            i++;
        } System.out.println(curr.data);
    }

    public boolean isEmpty() {
        if(head == null) return true;
        return false;
    }

    public void pop() {
        if(length == 0) {
            System.out.println("Stack UnderFlow......");
        }
        if(length == 1) {
            head = null;
        }
        ListNode curr = head;
        int i=0;
        while(i < length-2) {
            curr = curr.next;
            i++;
        } 
        curr.next = null;
        length--;
    }
}
