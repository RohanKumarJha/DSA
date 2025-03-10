
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

    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode temp1 = head1, temp2 = head2;
        ListNode head = null;
        ListNode temp = null;
    
        while (temp1 != null && temp2 != null) {
            if (temp1.data > temp2.data) {
                if (head == null) {
                    head = temp2;
                    temp = temp2;
                } else {
                    temp.next = temp2;
                    temp = temp2;
                } temp2 = temp2.next;
            } else {
                if (head == null) {
                    head = temp1;
                    temp = temp1;
                } else {
                    temp.next = temp1;
                    temp = temp1;
                } temp1 = temp1.next;
            }
        }
    
        // Attach remaining nodes from either list
        if (temp1 != null) {
            temp.next = temp1;
        }
        if (temp2 != null) {
            temp.next = temp2;
        } return head;    
    }
}
