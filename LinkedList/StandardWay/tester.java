public class tester {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Add elements in LinkedList
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);

        // Display elements of linkedlist
        ll.display();

        // Display length of linkedlist
        System.out.println();
        System.out.println("The length of linked list is "+ll.len);

        // Add elements ar random position in LinkedList
        ll.add(1,100);
        ll.add(3,1000);
        ll.add(7,0);
        ll.display();

        // Get element
        System.out.println();
        int result = ll.getElm(6);
        System.out.println((result!=Integer.MIN_VALUE)?result:"OutOfBoundException...");

        // Delete element
        ll.delete(3);
        ll.display();
    }
}
