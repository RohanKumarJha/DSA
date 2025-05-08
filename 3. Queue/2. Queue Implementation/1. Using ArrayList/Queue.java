import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> arr = new ArrayList<>();
    int size = 0;
    int start = -1;
    int end = -1;

    public void offer(int i) {
        arr.add(i);
        if(start == -1) {
            start = 0;
            end = 0;
        } else {
            end++;
        } size++;
    }

    public void peek() {
        if(start == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr.get(start));
        }
    }

    public void poll() {
        if(start <= end) {
            start++;
            size--;
        } else {
            start = -1;
            end = -1;
            size = 0;
        }
    }
}
