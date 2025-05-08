public class LinkedList {
    ListNode head = null;
    ListNode tail = null;
    int size = 0;
    
    public void addFirst(int data) {
        ListNode curr = new ListNode(data);
        if(head == null) {
            head = curr;
            tail = curr;
        } else {
            curr.next = head;
            head = curr;
        } size++;
    }

    public void addLast(int data) {
        ListNode curr = new ListNode(data);
        if(head == null) {
            head = curr;
            tail = curr;
        } else {
            tail.next = curr;
            tail = curr;
        } size++;
    }

    public void add(int index, int data) {
        ListNode curr = new ListNode(data);
        if (index == 0) { 
            addFirst(data); 
            return; 
        } else if (index == size) { 
            addLast(data); 
            return; 
        } else if (index > size) { 
            System.out.println("Index shouldn't be greater than size");
            return;
        }
    
        ListNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        
        curr.next = temp.next; // Correct insertion step
        temp.next = curr; // Link the new node
        size++;
    }

    public void display() {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        } System.out.println();
    }

    public int size() {
        return size;
    }

    public void removeFirst() {
        if(size == 0) {
            System.out.println("There is no element to remove");
        } else {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        ListNode curr = head;
        if(size == 0) {
            System.out.println("There is no element to remove");
        } else if(size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            while(curr.next.next != null) {
                curr = curr.next;
            } curr.next = null;
            tail = curr;
            size--;
        }
    }

    public void remove(int index) {
        ListNode curr = head;
        if(index == 0) {
            removeFirst();
        } else if(index == size-1) {
            removeLast();
        } else if(index >= size) {
            System.out.println("Index shouldn't be greater than size");
        } else {
            while(index != 1) {
                curr = curr.next;
            } curr.next = curr.next.next;
            size--;
        }
    }

    public int displayLastElm() {
        return tail.data;
    }


}
