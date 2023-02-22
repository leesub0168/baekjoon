import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (n > 0) {
            n--;
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            for(int i=0;i<s.length();i++) {
                char c = s.charAt(i);
                if(stack.isEmpty()) {
                    stack.push(c);
                }else if(stack.peek() == c) {
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
            if(stack.isEmpty()) cnt++;
        }
        bw.write(cnt+"");
        bw.flush();
        bw.close();
    }
}