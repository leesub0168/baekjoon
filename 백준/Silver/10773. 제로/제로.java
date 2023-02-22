import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        while(k>0) {
            k--;
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                if(!stack.isEmpty()) stack.pop();
            }else {
                stack.push(n);
            }
        }
        int sum = 0;
        while(stack.size() > 0) {
            sum += stack.pop();
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}