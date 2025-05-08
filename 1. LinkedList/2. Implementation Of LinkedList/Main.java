public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(10) ;      
        ll.add(1,100);
        ll.add(1, 99);
        ll.add(2, 79);
        ll.add(2, 35);
        ll.display();
        System.out.println("The size of linkedlist is "+ll.size());
        ll.removeFirst();
        ll.removeLast();
        ll.remove(1);
        ll.display();
        System.out.println("The last element is "+ll.displayLastElm());
        System.out.println("The size of linkedlist is "+ll.size());
    }
}