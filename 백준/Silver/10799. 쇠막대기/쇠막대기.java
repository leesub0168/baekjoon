import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        char mark = 'a';
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(c);
            }else if(mark == '(' && c == ')' && !stack.isEmpty()) {
                stack.pop();
                cnt += stack.size();
            }else if(c == ')' && stack.peek() == '(') {
                cnt++;
                stack.pop();
            }
            mark = c;
        }
        bw.write(cnt+"");
        bw.flush();
        bw.close();
    }
}