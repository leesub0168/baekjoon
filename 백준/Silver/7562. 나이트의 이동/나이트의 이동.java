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
        while(cnt > 0) {
            cnt--;
            int n = Integer.parseInt(br.readLine());
            String s1 = br.readLine();
            String s2 = br.readLine();
            int x = Integer.parseInt(s1.split(" ")[0]);
            int y = Integer.parseInt(s1.split(" ")[1]);
            int[][] dist = new int[302][302];
            for(int i=0;i<302;i++) {
                for(int j=0;j<302;j++) {
                    dist[i][j] = -1;
                    if(i == x && y == j) {
                        dist[i][j] = 0;
                    }
                }
            }

            Queue<EntryPair> queue = new ArrayDeque<>();
            queue.add(new EntryPair(x,y));

            int[] dx = {-2,-1,1,2,2,1,-1,-2};
            int[] dy = {1,2,2,1,-1,-2,-2,-1};

            while (!queue.isEmpty()) {
                EntryPair pair = queue.remove();
                for(int i=0;i<8;i++) {
                    int nx = pair.x + dx[i];
                    int ny = pair.y + dy[i];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                    if(dist[nx][ny] != -1) continue;
                    dist[nx][ny] = dist[pair.x][pair.y] + 1;
                    queue.add(new EntryPair(nx,ny));
                }
            }
            bw.write(dist[Integer.parseInt(s2.split(" ")[0])][Integer.parseInt(s2.split(" ")[1])]+"\n");
        }
        bw.flush();
        bw.close();
    }
}