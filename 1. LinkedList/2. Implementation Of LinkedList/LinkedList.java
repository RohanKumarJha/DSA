public class LinkedList {
    ListNode head = null;
    ListNode tail = null;
    int length = 0;

    public void insertAtEnd(int elm) {
        ListNode node = new ListNode(elm);
        if(head == null) {
            head = node;
        } else {
            tail.next = node;
        } tail = node;
        length++;
    }

    public void insertAtBeginning(int elm) {
        ListNode node = new ListNode(elm);
        if(head != null) {
            node.next = head;  
        } head = node;
        length++;
    }

    public void insert(int index,int elm) {
        ListNode node = new ListNode(elm);
        ListNode temp = head;
        if(index > length) {
            System.out.println("Index OutOfBound....");
        } else {
            if(index == 0) {
                insertAtBeginning(elm);
            } else if(index == 1) {
                node.next = temp.next;
                temp = node;
            } else {
                for(int i=0; i<index-1; i++) {
                    temp = temp.next;
                } node.next = temp.next;
                temp = node;
            }
        } length++;
    }

    public void display() {
        ListNode node = head;
        while(node != null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public void deleteAtIndex(int index) {
        ListNode node = head;
        if(index > length) {
            System.out.println("Index outOfBound....");
        } else {
            if(index == 0) {
                head = node.next;
            } else if(index == 1) {
                node.next = node.next.next;
            } else {
                for(int i=0; i<index-1; i++) {
                    node = node.next;
                } node.next = node.next.next;
            } 
        } length--;
    }
}