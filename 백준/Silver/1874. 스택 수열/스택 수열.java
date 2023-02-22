import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;

        StringBuffer sb = new StringBuffer();
        while (n>0) {
            n--;
            int t = Integer.parseInt(br.readLine());
            while (cnt <= t) {
                stack.push(cnt++);
                sb.append("+\n");
            }
            if(stack.peek() != t) {
                sb = new StringBuffer("NO\n");
                break;
            }
            stack.pop();
            sb.append("-\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}