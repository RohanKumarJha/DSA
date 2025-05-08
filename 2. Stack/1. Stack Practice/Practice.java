import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(2);
        st.push(6);
        st.push(9);
        st.push(4);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
    }
}