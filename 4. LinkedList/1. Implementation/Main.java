public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(12);
        ll.insert(23);
        ll.insert(35);
        ll.insertAtBegin(1);
        ll.insert(100);
        ll.insert(2,244);
        ll.delete(0);
        ll.deleteFromVal(244);
        ll.deleteFromVal(1000);
        ll.display();
        System.out.println("The length of ll is "+ll.length);
    }
}