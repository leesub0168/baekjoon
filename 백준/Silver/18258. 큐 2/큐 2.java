import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();
        int memo = -1;

        while(n > 0) {
            n--;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String m = st.nextToken();
            if(m.equals("push")) {
                memo = Integer.parseInt(st.nextToken());
                queue.offer(memo);
            }else if(m.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write("-1\n");
                }else {
                    bw.write(queue.peek()+"\n");
                }
            }else if(m.equals("back")) {
                if(queue.isEmpty()) {
                    bw.write("-1\n");
                }else {
                    bw.write(memo + "\n");
                }
            }else if(m.equals("size")) {
                bw.write(queue.size()+"\n");
            }else if(m.equals("empty")) {
                if(queue.isEmpty()) {
                    bw.write("1\n");
                }else {
                    bw.write("0\n");
                }
            }else { // pop
                if(queue.isEmpty()) {
                    bw.write("-1\n");
                }else {
                    bw.write(queue.poll()+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}