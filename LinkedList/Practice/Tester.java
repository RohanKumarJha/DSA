import LinkedList.Node;

public class Tester {
    static int len = 0;
    public static int rec(Node temp) {
        if(temp == null) return len;
        len++;
        rec(temp.next);
        return len;
    }


    // public static int length(Node temp) {
    //     int len = 0;
    //     while(temp != null) {
    //         len++;
    //         temp = temp.next;
    //     }
    //     return len;
    // }


    // public static void recursion(Node temp) {
    //     if(temp == null) return;
    //     System.out.println(temp.value);
    //     recursion(temp.next);
    // }


    // public static void iterator(Node temp) {
    //     while(temp != null) {
    //         System.out.println(temp.value);
    //         temp = temp.next;
    //     }
    // } 


    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(7);
        Node c = new Node(12);
        Node d = new Node(9);
        Node e = new Node(17);


        // CONNECT THE NODES
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        // PRINT INDIVIDUALLY USING FIRST ELEMENT
        // System.out.println(a.value);
        // System.out.println(a.next.value);
        // System.out.println(a.next.next.value);
        // System.out.println(a.next.next.next.value);
        // System.out.println(a.next.next.next.next.value);


        // USING ITERATOR FIXED SIZE
        // Node temp = a;
        // for(int i=1; i<=5; i++) {
        //     System.out.println(temp.value);
        //     temp = temp.next;
        // }


        // USING ITERATOR NOTFIXED SSIZE
        // Node temp = a;
        // while(temp != null) {
        //     System.out.println(temp.value);
        //     temp = temp.next;
        // }


        // USING METHOD
        // iterator(a);


        // USING RECURSION
        // recursion(a);


        // LENGTH OF LINKEDLIST USING ITERATOR
        // System.out.println(length(a));


        // LENGTH OF LINKEDLIST USING Recursion
        System.out.println(rec(a));
    }
}
