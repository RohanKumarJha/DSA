public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.peek();
        System.out.println(st.isEmpty());
        System.out.println("The length of stack is "+st.length);
        st.pop();
        st.peek();
        System.out.println("The length of stack is "+st.length);
    }
}