import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st.isEmpty());
        System.out.println(st.size());

        while(!st.isEmpty()) {
            System.out.print(st.pop()+" ");
        }

        System.out.println(st.isEmpty());
    }
}