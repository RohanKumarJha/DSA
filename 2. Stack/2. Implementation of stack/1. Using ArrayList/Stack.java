import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> arr = new ArrayList<>();
    int pointer = -1;

    public void push(int data) {
        arr.add(data);
        pointer++;
    }

    public void peek() {
        if(pointer == -1) {
            isEmpty();
        } else {
            System.out.println(arr.get(pointer));
        }
    }

    public void pop() {
        if(pointer == -1) {
            isEmpty();
        } else {
            pointer--;
        }
    }

    public void isEmpty() {
        if(pointer == -1) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The stack is not empty");
        }
    }

    public void clear() {
        pointer = -1;
    }
}
