
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.display();
        ll.reverse();
        ll.display();

        LinkedList ll1 = new LinkedList();
        ll1.add(0);
        ll1.add(2);
        ll1.add(4);
        ll1.add(6);
        ll1.add(8);
        ListNode head1 = ll1.head;

        LinkedList ll2 = new LinkedList();
        ll2.add(1);
        ll2.add(3);
        ll2.add(5);
        ll2.add(7);
        ll2.add(9);
        ListNode head2 = ll2.head;

        ListNode head = ll.merge(head1, head2);
        while(head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}