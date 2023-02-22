import java.util.*;
import java.io.*;

class EntryPairZ {
    int x;
    int y;
    int z;
    
    public EntryPairZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+2][m+2];
        int[][][] dist = new int[n+2][m+2][2];
        String s;

        for(int i=0;i<n;i++) {
            s = br.readLine();
            for(int j=0;j<m;j++) {
                arr[i][j] = Character.getNumericValue(s.charAt(j));
                dist[i][j][0] = -1;
                dist[i][j][1] = -1;
            }
        }
        dist[0][0][0] = 1;
        dist[0][0][1] = 1;

        Queue<EntryPairZ> queue = new ArrayDeque<>();
        queue.add(new EntryPairZ(0,0,0));
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        boolean flag = false;
        while (!queue.isEmpty() && !flag) {
            EntryPairZ pair = queue.remove();
            if(pair.x == n-1 && pair.y == m-1) {
                flag = true;
                bw.write(dist[pair.x][pair.y][pair.z]+"");
            }
            if(flag) continue;
            int next = dist[pair.x][pair.y][pair.z] + 1;
            for(int i=0;i<4;i++) {
                int nx = pair.x + dx[i];
                int ny = pair.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(arr[nx][ny] == 0 && dist[nx][ny][pair.z] == -1) {
                    dist[nx][ny][pair.z] = next;
                    queue.add(new EntryPairZ(nx,ny, pair.z));
                }
                if(pair.z == 0 && arr[nx][ny] == 1 && dist[nx][ny][1] == -1) {
                    dist[nx][ny][1] = next;
                    queue.add(new EntryPairZ(nx,ny,1));
                }
            }
        }

        if(!flag) {
            bw.write("-1");
        }
        bw.flush();
        bw.close();
    }
}