public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(12);
        ll.insertAtBeginning(1);
        ll.insertAtEnd(17);
        ll.insertAtBeginning(11);
        ll.insertAtEnd(62);
        ll.insertAtBeginning(91);
        ll.insert(1,100);
        ll.insert(5, 99);
        ll.deleteAtIndex(3);
        ll.deleteAtIndex(1);
        ll.deleteAtIndex(0);
        ll.display();
        System.out.println();
        System.out.println("The length of linkedlist is "+ll.length);
    }
}
