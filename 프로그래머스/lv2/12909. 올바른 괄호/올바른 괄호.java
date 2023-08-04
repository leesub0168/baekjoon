import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : arr) {
            if(c == '(') {
                stack.push(c);
            }else {
                if(stack.isEmpty()) return false;
                if(stack.peek() == '(') stack.pop();
            }
        }

        return stack.isEmpty();
    }
}