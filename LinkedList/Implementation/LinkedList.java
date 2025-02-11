public class LinkedList {
    ListNode head = null;
    ListNode temp = head;
    int length = 0;

    public void add(int val) {
        ListNode a = new ListNode(val);
        if(head == null) head = a;
        else temp.next = a;
        temp = a;
        length++;
    }

    public void display() {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public void getElm(int idx) {
        ListNode temp = head;
        int i=0;
        boolean flag = false;
        while(i<idx) {
            temp = temp.next;
            i++;
            if(i == length) {
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println("Element at index "+idx+" is "+temp.val);
        } else {
            System.out.println("NullPointerException....");
        }
    }
}
