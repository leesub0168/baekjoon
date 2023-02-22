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
        
        int cnt = Integer.parseInt(br.readLine());
        
        for(int i=0;i<cnt;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int cab = Integer.parseInt(st.nextToken());
            int[][] field = new int[52][52];
            boolean[][] vis = new boolean[52][52];
            
            for(int j=0;j<cab;j++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int nx = Integer.parseInt(st1.nextToken());
                int ny = Integer.parseInt(st1.nextToken());
                field[nx][ny] = 1;
            }
            
            int[] dx = {1,0,-1,0};
            int[] dy = {0,1,0,-1};
            int num = 0;
            
            for(int j=0;j<m;j++) {
                for(int k=0;k<n;k++) {
                    if(field[j][k] == 0 || vis[j][k]) continue;
                    num++;
                    vis[j][k] = true;
                    Queue<EntryPair> queue = new ArrayDeque<>();
                    queue.add(new EntryPair(j,k));
                    
                    while(!queue.isEmpty()) {
                        EntryPair pair = queue.remove();
                        for(int dir=0;dir<4;dir++) {
                            int nx = pair.x + dx[dir];
                            int ny = pair.y + dy[dir];
                            if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
                            if(field[nx][ny] != 1 || vis[nx][ny]) continue;
                            vis[nx][ny] = true;
                            queue.add(new EntryPair(nx,ny));
                        }
                    }
                }
            }
            bw.write(num+"\n");
            
        }
        bw.flush();
        bw.close();
    }
}