import java.util.Stack;

public class Solution {

    static Stack<Integer> st = new Stack<>();
    
    public static void display(Stack<Integer> st) {
        while(!st.isEmpty()) {
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }

    public static void sortStack(Stack<Integer> st) {
        if(st.isEmpty()) {
            return;
        }
        int temp = st.pop();
        sortStack(st);
        insertInOrder(st,temp);
    }

    public static void insertInOrder(Stack<Integer> st,int temp) {
        if(st.isEmpty() || temp < st.peek()) {
            st.push(temp);
            return;
        }
        int elm = st.pop();
        insertInOrder(st, temp);
        st.push(elm);
    }

}
