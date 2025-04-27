public class Practice {

    // private static void printRecursion(Node temp) {
    //     if(temp == null) return;
    //     printRecursion(temp.next);
    //     System.out.print(temp.data+" ");
    // }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);


        // Iterative approach
        // Node temp = a;
        // while(temp!=null) {
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }

        
        // Recursive approach
        // Node temp = a;
        // printRecursion(temp);


        // Length of ll
        // Node temp = a;
        // int len = 0;
        // while(temp!=null) {
        //     len++;
        //     temp = temp.next;
        // } System.out.println("The length of ll is "+len);

        // Insert at end
        Node temp = head;
        Node val = new Node(10);
        while(temp.next != null) {
            temp = temp.next;
        } temp.next = val;
    }

    
}