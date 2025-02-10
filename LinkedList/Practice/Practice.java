
public class Practice {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static void llRecursively(ListNode temp) {
        if(temp == null) return;
        System.out.println(temp.val);
        llRecursively(temp.next);
    }
    
    public static void main(String[] args) {
        ListNode head = null;
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // System.out.println(a.val);
        // System.out.println(b.val);
        // System.out.println(c.val);
        // System.out.println(d.val);
        // System.out.println(e.val);

    // 1 DISPLAY LINKEDLIST ITERATIVE APPROACH
        // ListNode temp = head;
        // while(temp != null) {
        //     System.out.println(temp.val);
        //     temp = temp.next;
        // }

    // 2 DISPLAY LINKEDLIST RECURSIVE APPROACH
        // ListNode temp = head;
        // llRecursively(temp);

    // 3 ADD ELEMENT INTO LINKEDLIST
        ListNode newElm = new ListNode(10);
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        } temp.next = newElm;
        temp = head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}