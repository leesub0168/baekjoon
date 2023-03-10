import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);


        ArrayList<Integer>[] vectors = new ArrayList[n+1];
        for (int i = 1; i < n + 1; i++) {
            vectors[i] = new ArrayList<>();
        }
        
        for (int i=0;i<m;i++) {
            String[] srr = br.readLine().split(" ");
            int u = Integer.parseInt(srr[0]);
            int subV = Integer.parseInt(srr[1]);

            vectors[u].add(subV);
            vectors[subV].add(u);
        }
        boolean[] vis = new boolean[n + 1];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (vis[i]) continue;
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(i);
            vis[i] = true;
            cnt++;

            while (!queue.isEmpty()) {
                int cur = queue.remove();
                for (Integer nxt : vectors[cur]) {
                    if (vis[nxt]) continue;
                    queue.add(nxt);
                    vis[nxt] = true;
                }
            }
        }
        System.out.println(cnt);
    }
}