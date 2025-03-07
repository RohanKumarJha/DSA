
public class LinkedList {
    ListNode head = null;
    ListNode curr = head;
    int length = 0;

    public void display() {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        } System.out.println();
    }

    public void insert(int data) {
        ListNode temp = new ListNode(data);
        if(head == null) {
            head = temp;
            curr = temp;
        } else {
            curr.next = temp;
            curr = curr.next;
        } length++;
    }

    public void insertAtBegin(int data) {
        ListNode temp = new ListNode(data);
        temp.next = head;
        head = temp;
        length++;
    }

    public void insert(int pos,int data) {
        if(pos == 0) {
            insertAtBegin(data);
        } else if(pos == length) {
            insert(data);
        } else if(pos < length) {
            ListNode curr = head;
            while(pos != 1) {
                curr = curr.next;
                pos--;
            } 
            ListNode temp = new ListNode(data);
            temp.next = curr.next;
            curr.next = temp;
            length++;
        } else {
            System.out.println("You can't add the data outside from linkedlist range");
        }
    }

    public void delete(int position) {
        if(position == 0) {
            head = head.next;
            length--;
        } else if(position < length) {
            ListNode curr = head;
            while(position != 1) {
                curr = curr.next;
                position--;
            }
            if(curr.next.next != null) {
                curr.next = curr.next.next;
                length--;
            } else {
                curr.next = null;
                length--;
            }
        } else {
            System.out.println("You can't delete the data outside from linkedlist range");
        }
    }

    public void deleteFromVal(int data) {
        ListNode temp = new ListNode(data);
        ListNode curr = head;
        boolean flag = true;
        while(curr != null) {
            if(curr.data == temp.data) {
                if(curr.next == null) {
                    curr = null;
                } else {
                    curr.data = curr.next.data;
                    curr.next = curr.next.next;
                } flag = false;
                break;
            } curr = curr.next;
        } if(flag) {
            System.out.println("Element not found");
        }
    }
}