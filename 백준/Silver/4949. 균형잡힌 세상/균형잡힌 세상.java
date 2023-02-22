import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean flag = true;
        while (flag) {
            String s = br.readLine();
            if(s.length() == 1 && s.equals(".")) {
                flag = false;
                break;
            }
            boolean check = false;
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<s.length();i++) {
                char c = s.charAt(i);
                if(c == '[' || c == '(') {
                    stack.push(c);
                }else if(c == ']') {
                    if(stack.isEmpty() || stack.peek() != '[') {
                        check = true;
                        break;
                    }else {
                        stack.pop();
                    }
                }else if(c == ')') {
                    if(stack.isEmpty()|| stack.peek() != '(') {
                        check = true;
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }
            if(check) {
                bw.write("no\n");
            }else if(stack.isEmpty()) {
                bw.write("yes\n");
            }else {
                bw.write("no\n");
            }
        }
        bw.flush();
        bw.close();
    }
}