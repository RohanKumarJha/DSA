public class Stack {
    int[] arr = new int[5];
    int length = 0;
    int pointer = 0;

    public void push(int data) {
        if(pointer < arr.length) {
            arr[pointer++] = data;
            length++;
        } else {
            System.out.println("Stack Overflow.....");
        }
    }

    public void peek() {
        System.out.println(arr[pointer-1]);
    }

    public void pop() {
        if(length == 0) {
            System.out.println("Stack Underflow");
        } else {
            arr[pointer-1] = 0;
            pointer--;
            length--;
        }
    }

    public boolean isEmpty() {
        if(length == 0) return true;
        return false;
    }
}
