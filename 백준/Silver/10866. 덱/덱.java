import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        while (n > 0) {
            n--;
            String s = br.readLine();
            if(s.equals("front")) {
                if(deque.isEmpty()) bw.write("-1\n");
                else bw.write(deque.getFirst()+"\n");
            }else if(s.equals("back")) {
                if(deque.isEmpty()) bw.write("-1\n");
                else bw.write(deque.getLast()+"\n");
            }else if(s.equals("size")) {
                bw.write(deque.size()+"\n");
            }else if(s.equals("empty")) {
                if (deque.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }else {
                StringTokenizer st = new StringTokenizer(s);
                s = st.nextToken();
                if(s.equals("push_back")) {
                    deque.addLast(Integer.parseInt(st.nextToken()));
                }else if(s.equals("push_front")) {
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                }else if(s.equals("pop_front")) {
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.removeFirst()+"\n");
                }else if(s.equals("pop_back")) {
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.removeLast()+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
        
    }
}