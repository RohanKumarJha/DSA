public class LinkedList {

    ListNode head = null;
    ListNode temp = null;
    int len = 0;

    public void display() {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public void add(int val) {
        ListNode a = new ListNode(val);
        if(head == null) {
            head = a;
            temp = a;
        } else {
            temp.next = a;
            temp = temp.next;
        } len++;
    }

    public void add(int idx,int elm) {
        ListNode a = new ListNode(elm);
        ListNode temp = head;
        if(idx == 1) {
            a.next = head;
            head = a;
            len++;
        } else if(idx < len) {
            while(idx-2 != 0) {
                temp = temp.next;
                idx--;
            } a.next = temp.next;
            temp.next = a;
            len++;
        } else if(idx == len+1){
            while(idx-2 != 0) {
                temp = temp.next;
                idx--;
            } temp.next = a;
            len++;
        } else {
            System.out.println("Index doesn't exist for that linkedlist");
        }
    }

    public int getElm(int idx) {
        ListNode temp = head;
        while(idx-1 != 0) {
            temp = temp.next;
            idx--;
        } return temp.val;
    }

    public void delete(int idx) {
        ListNode temp = head;
        if(idx == 1) {
            head = head.next;
            len--;
        } else if(idx == len) {
            while(temp.next.next != null) {
                temp.next = null;
            } len--;
        } else if(idx < len) {
            while(idx-2 != 0) {
                temp = temp.next;
                len--;
                idx--;
            } temp.next = temp.next.next;
        } 
    }
}
