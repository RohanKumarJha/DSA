public class LinkedList {
    ListNode head = null;
    ListNode temp = head;

    public void display() {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        } System.out.println();
    }

    public void add(int data) {
        ListNode curr = new ListNode(data);
        if(temp == null) {
            temp = curr;
            head = curr;
        } else {
            temp.next = curr;
            temp = temp.next;
        }
    }

    public void reverse() {
        ListNode prev=null, agla=null, curr=head;
        while(curr != null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        } head = prev;
    }
}
