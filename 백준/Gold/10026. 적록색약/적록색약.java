import java.util.*;
import java.io.*;

class EntryPair {
    int x;
    int y;
    public EntryPair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static int bfs(char[][] arr, boolean[][] vis, int n) {
        int ans = 0;
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(vis[i][j]) continue;
                vis[i][j] = true;
                ans++;
                Queue<EntryPair> queue = new ArrayDeque<>();
                queue.add(new EntryPair(i,j));

                while (!queue.isEmpty()) {
                    EntryPair pair = queue.remove();
                    for(int dir=0;dir<4;dir++) {
                        int nx = pair.x + dx[dir];
                        int ny = pair.y + dy[dir];

                        if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                        if(vis[nx][ny] || arr[nx][ny] != arr[pair.x][pair.y]) continue;
                        vis[nx][ny] = true;
                        queue.add(new EntryPair(nx,ny));
                    }
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[102][102];
        boolean[][] vis = new boolean[102][102];


        for(int i=0;i<n;i++) {
            String s = br.readLine();
            for(int j=0;j<n;j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        int not_g = bfs(arr,vis,n);

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j] == 'G') {
                    arr[i][j] = 'R';
                }
                vis[i][j] = false;
            }
        }


        int g = bfs(arr,vis,n);

        bw.write(not_g + " " + g);
        bw.flush();
        bw.close();
        
    }
    
}