import java.util.*;
import java.io.*;
class Test {
    List<Integer>[] lists;
    int[] p;
    public void solution(BufferedReader br) throws Exception {
        int vertex = Integer.parseInt(br.readLine());
        lists = new ArrayList[vertex+1];
        p = new int[vertex+1];
        
        for(int i = 0; i < vertex + 1; i++) {
            lists[i] = new ArrayList<>();
        }
        for(int i = 1; i < vertex; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            lists[u].add(v);
            lists[v].add(u);
        }
        dfs(1);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 2;i <= vertex; i++) {
            sb.append(p[i]).append("\n");
        }
        System.out.println(sb);
    }
    public void dfs(int cur) {
        for(int nxt : lists[cur]) {
            if(p[cur] == nxt) continue;
            p[nxt] = cur;
            dfs(nxt);
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