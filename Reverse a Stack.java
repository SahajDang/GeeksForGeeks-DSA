// User function Template for Java
import java.util.*;

class Solution {
    static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        insertAtBottom(top, s); // fixed call and parameter
    }

    static void insertAtBottom(int topValue, Stack<Integer> stack) { // made it static
        if (stack.isEmpty()) {
            stack.push(topValue);
            return;
        }
        int top = stack.pop();
        insertAtBottom(topValue, stack);
        stack.push(top);
    }
}
