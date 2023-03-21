import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vertex = Integer.parseInt(br.readLine());
        
        List<Integer>[] lists = new ArrayList[vertex + 1];
        for(int i = 0; i < vertex + 1; i++ ) {
            lists[i] = new ArrayList<>();
        }
        for(int i = 0; i < vertex-1; i++) {
            String[] arr = br.readLine().split(" ");
            int u = Integer.parseInt(arr[0]);
            int v = Integer.parseInt(arr[1]);
            
            lists[u].add(v);
            lists[v].add(u);
        }
        
        int[] p = new int[vertex+1];
        
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            
            for(int nxt : lists[cur]) {
                if(p[cur] == nxt) continue;
                queue.add(nxt);
                p[nxt] = cur;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=2;i<=vertex;i++) {
            sb.append(p[i]).append("\n");
        }
        System.out.println(sb);
    }
}