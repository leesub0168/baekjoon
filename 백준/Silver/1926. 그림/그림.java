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
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean[][] vis = new boolean[n][m];

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        int mx = 0;
        int num = 0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(arr[i][j] == 0 || vis[i][j]) continue;
                num++;

                Queue<Pair> queue = new ArrayDeque<>();
                vis[i][j] = true;
                queue.add(new Pair(i,j));
                int area = 0;
                while (!queue.isEmpty()) {
                    area++;
                    Pair pair =  queue.poll();

                    for(int dir=0;dir<4;dir++) {
                        int nx = pair.x + dx[dir];
                        int ny = pair.y + dy[dir];
                        if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                        if(vis[nx][ny] || arr[nx][ny] != 1) continue;
                        vis[nx][ny] = true;
                        queue.add(new Pair(nx,ny));
                    }
                }

                if(mx < area) mx = area;
            }
        }

        System.out.println(num);
        System.out.println(mx);
    }
}