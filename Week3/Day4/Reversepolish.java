package Day4;
import java.util.*;

public class Reversepolish {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            } 
            else if (token.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            } 
            else if (token.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            } 
            else if (token.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b); // truncates toward zero in Java
            } 
            else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
}
