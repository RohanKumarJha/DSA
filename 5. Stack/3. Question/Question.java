import java.util.Stack;

public class Question {
    public static void main(String[] args) {
        String[] arr = {"8","2","+","5","*","9","+"};
        Stack<String> st = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i]=="+" | arr[i]=="-" | arr[i]=="*" | arr[i]=="/") {
                int num1 = Integer.parseInt(st.peek());
                st.pop();
                int num2 = Integer.parseInt(st.peek());
                st.pop();
                int result = 0;
                if(arr[i] == "+") {
                    result = num1+num2;
                } else if(arr[i] == "-") {
                    result = num1-num2;
                } else if(arr[i] == "*") {
                    result = num1*num2;
                } else {
                    result = num1/num2;
                } 
                st.push(String.valueOf(result));
            } else {
                st.push(arr[i]);
            }
        } System.out.println(st.pop());
    }
}