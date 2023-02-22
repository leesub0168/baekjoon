import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1;i<=n;i++) {
            list.add(i);
        }
        
        int idx = k-1;
        bw.write("<");
        while(true) {
            if(list.size() == 1) {
                bw.write(list.remove(idx) + ">");
            }else {
                bw.write(list.remove(idx) + ", ");
            }
            if(list.isEmpty()) break;
            idx += (k-1);
            while(idx >= list.size()) {
                idx -= list.size();
            }
            
        }
        
        bw.flush();
        bw.close();
    }
}