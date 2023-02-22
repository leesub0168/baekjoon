import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n > 0) {
            n--;
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean result = true;
            for(int i=0;i<s.length();i++) {
                char c = s.charAt(i);
                if(c == '(') stack.push(c);
                else if(c == ')') {
                    if(stack.isEmpty() || stack.peek() != '(') {
                        result = false;
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }
            if(!result || !stack.isEmpty()) bw.write("NO\n");
            else bw.write("YES\n");
        }
        bw.flush();
        bw.close();
    }
}