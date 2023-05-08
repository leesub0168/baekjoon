import java.util.*;
import java.io.*;

class Pair {
    int x;
    int y;
    
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[n][m];
        int[][] dist = new int[n][m];
        
        for(int i = 0; i < n; i++) {
            String[] strs = br.readLine().split("");
            Arrays.fill(dist[i], -1);
            
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(strs[j]);
                
                if(arr[i][j] == 1) dist[i][j] = 0;
            }
        }
        
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(0,0));
        dist[0][0] = 1;
        
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            
            for(int i = 0; i < 4; i++) {
                int nx = pair.x + dx[i];
                int ny = pair.y + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(arr[nx][ny] == 1 && dist[nx][ny] == 0) {
                    dist[nx][ny] = dist[pair.x][pair.y] + 1;
                    queue.add(new Pair(nx, ny));
                }
            }
        }
        
        System.out.println(dist[n-1][m-1]);
    }
}