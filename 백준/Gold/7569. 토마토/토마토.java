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
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[][][] box = new int[102][102][102];
        int[][][] dist = new int[102][102][102];
        Queue<EntryPairZ> queue = new ArrayDeque<>();

        for(int k=0;k<h;k++) {
            for(int i=0;i<n;i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for(int j=0;j<m;j++) {
                    box[k][i][j] = Integer.parseInt(st1.nextToken());
                    if(box[k][i][j] == 1) {
                        queue.add(new EntryPairZ(i,j,k));
                    }
                    if(box[k][i][j] == 0) {
                        dist[k][i][j] = -1;
                    }
                }
            }
        }

        int[] dx = {1,0,-1,0,0,0};
        int[] dy = {0,1,0,-1,0,0};
        int[] dz = {0,0,0,0,1,-1};

        while (!queue.isEmpty()) {
            EntryPairZ pairZ = queue.remove();
            for(int i=0;i<6;i++) {
                int nx = pairZ.x + dx[i];
                int ny = pairZ.y + dy[i];
                int nz = pairZ.z + dz[i];

                if(nx < 0 || ny < 0 || nz < 0 || nx >= n || ny >= m || nz >= h) continue;
                if(dist[nz][nx][ny] >= 0) continue;
                dist[nz][nx][ny] = dist[pairZ.z][pairZ.x][pairZ.y] +1;
                queue.add(new EntryPairZ(nx,ny,nz));

            }
        }
        int ans = Integer.MIN_VALUE;
        boolean flag = false;
        for(int k=0;k<h;k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(!flag && dist[k][i][j] == -1) {
                        bw.write("-1");
                        flag = true;
                    }
                    ans = Math.max(ans, dist[k][i][j]);
                }
            }
        }
        if(!flag) {
            bw.write(ans+"");
        }
        bw.flush();
        bw.close();
    }
}