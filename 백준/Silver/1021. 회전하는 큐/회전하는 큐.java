import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        LinkedList<Integer> list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++) {
            list.add(i);
        }
        int cnt = 0;
        while(k > 0) {
            k--;
            int x = Integer.parseInt(st.nextToken());
            int idx = list.indexOf(x);
            while (list.getFirst() != x) {
                if(idx < list.size() - idx) {
                    list.addLast(list.getFirst());
                    list.removeFirst();
                }else  {
                    list.addFirst(list.getLast());
                    list.removeLast();
                }
                cnt++;
            }
            list.removeFirst();
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}