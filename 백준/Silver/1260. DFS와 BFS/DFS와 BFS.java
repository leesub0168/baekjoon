import java.util.*;
import java.io.*;

class Test {
    
    int start, vertex, edge;
    List<Integer>[] lists;
    StringBuilder sb = new StringBuilder();
    public void solution(BufferedReader br) throws Exception {
        String[] srr = br.readLine().split(" ");
        vertex = Integer.parseInt(srr[0]);
        edge = Integer.parseInt(srr[1]);
        start = Integer.parseInt(srr[2]);
        lists = new ArrayList[vertex + 1];
        
        for(int i=1;i<vertex+1;i++) {
            lists[i] = new ArrayList<>();    
        }
        
        for(int i=0;i<edge;i++) {
            String[] str = br.readLine().split(" ");
            int u = Integer.parseInt(str[0]);
            int v = Integer.parseInt(str[1]);
           
            lists[u].add(v);
            lists[v].add(u);
        }
        
        dfs();
        sb.append("\n");
        bfs();
        System.out.println(sb);
    }
    public void dfs() {
        Stack<Integer> stack = new Stack<>();
        boolean[] vis = new boolean[vertex+1];
        stack.push(start);
        
        while(!stack.isEmpty()) {
            int x = stack.pop();
            if(vis[x]) continue;
            vis[x] = true;
            sb.append(x).append(" ");
            Collections.sort(lists[x], Collections.reverseOrder());
            for(Integer next : lists[x]) {
                if(vis[next]) continue;
                stack.push(next);
            }
        }
    }
    public void bfs() {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] vis = new boolean[vertex+1];
        
        queue.add(start);
        vis[start] = true;
        while(!queue.isEmpty()) {
            int x = queue.remove();
            sb.append(x).append(" ");
            Collections.sort(lists[x]);
            for(Integer next : lists[x]) {
                if(vis[next]) continue;
                vis[next] = true;
                queue.add(next);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Test test = new Test();
        test.solution(br);
    }
}