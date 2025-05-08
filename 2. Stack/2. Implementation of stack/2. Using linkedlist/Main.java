public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.peek();
        System.out.println("The size of stack is "+st.size);
    }
}