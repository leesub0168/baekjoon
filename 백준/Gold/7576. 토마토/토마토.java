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
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] box = new int[n+1][m+1];
        int[][] dist = new int[n+1][m+1];
        Queue<EntryPair> queue = new ArrayDeque<>();

        for(int i=0;i<n;i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                box[i][j] = Integer.parseInt(st1.nextToken());
                if(box[i][j] == 1) {
                    queue.add(new EntryPair(i,j));
                }
                if(box[i][j] == 0) {
                    dist[i][j] = -1;
                }
            }
        }

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        while (!queue.isEmpty()) {
            EntryPair pair = queue.remove();
            for (int i=0;i<4;i++) {
                int nx = pair.x + dx[i];
                int ny = pair.y + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(dist[nx][ny] >= 0) continue;
                dist[nx][ny] = dist[pair.x][pair.y] + 1;
                queue.add(new EntryPair(nx,ny));
            }
        }
        int ans = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(!flag && dist[i][j] == -1) {
                    bw.write("-1");
                    flag = true;
                }
                ans = Math.max(ans, dist[i][j]);
            }
        }
        if(!flag) {
            bw.write(ans+"");
        }
        bw.flush();
        bw.close();
        
    }
}