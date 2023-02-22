import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=1;i<=n;i++) {
            q.offer(i);
        }
        while (q.size() > 1) {
            q.poll();
            int x = q.poll();
            q.offer(x);
        }
        bw.write(q.peek()+"");
        bw.flush();
        bw.close();
    }
}