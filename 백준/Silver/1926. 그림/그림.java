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
        boolean[][] vis = new boolean[n][m];
        
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            
            for(int j=0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        
        int mx = 0;
        int cnt = 0;
        
        for(int i=0; i < n; i++) {
            for(int j=0; j < m; j++) {
                if(vis[i][j] || arr[i][j] == 0) continue;
                
                cnt++;
                Queue<Pair> queue = new ArrayDeque<>();
                queue.add(new Pair(i,j));
                vis[i][j] = true;
                int area = 0;
                while(!queue.isEmpty()) {
                    area++;
                    Pair pair = queue.poll();
                    
                    for(int k=0; k < 4; k++) {
                        int nx = pair.x + dx[k];
                        int ny = pair.y + dy[k];
                        
                        if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                        if(vis[nx][ny] || arr[nx][ny] != 1) continue;
                        vis[nx][ny] = true;
                        queue.add(new Pair(nx, ny));
                        
                    }
                    
                }
                if(mx < area) mx = area;
                
            }
        }
        System.out.println(cnt);
        System.out.println(mx);
    }
}