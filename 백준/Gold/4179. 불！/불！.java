import java.util.*;
import java.io.*;

class EntryPair {
    int x;
    int y;

    public EntryPair(int x, int y)  {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[][] dist1 = new int[1002][1002];
        int[][] dist2 = new int[1002][1002];
        char[][] maze = new char[1002][1002];

        Queue<EntryPair> queue1 = new ArrayDeque<>();
        Queue<EntryPair> queue2 = new ArrayDeque<>();

        for(int i=0;i<r;i++) {
            String s = br.readLine();
            for(int j=0;j<c;j++) {
                maze[i][j] = s.charAt(j);
                dist1[i][j] = -1;
                dist2[i][j] = -1;

                if(maze[i][j] == 'J') {
                    queue1.add(new EntryPair(i,j));
                    dist1[i][j] = 0;
                }
                if(maze[i][j] == 'F') {
                    queue2.add(new EntryPair(i,j));
                    dist2[i][j] = 0;
                }
            }
        }

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        while(!queue2.isEmpty()) {
            EntryPair pair = queue2.remove();
            for(int dir=0;dir<4;dir++) {
                int nx = pair.x + dx[dir];
                int ny = pair.y + dy[dir];

                if(nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
                if(dist2[nx][ny] >= 0 || maze[nx][ny] == '#') continue;
                dist2[nx][ny] = dist2[pair.x][pair.y] + 1;
                queue2.add(new EntryPair(nx,ny));

            }
        }
        while(!queue1.isEmpty()) {
            EntryPair pair = queue1.remove();
            for(int dir=0;dir<4;dir++) {
                int nx = pair.x + dx[dir];
                int ny = pair.y + dy[dir];

                if(nx < 0 || nx >= r || ny < 0 || ny >= c) {
                    bw.write((dist1[pair.x][pair.y] +1)+"");
                    bw.flush();
                    bw.close();
                    return;
                };
                if(dist1[nx][ny] >= 0 || maze[nx][ny] == '#') continue;
                if(dist2[nx][ny] != -1 &&  dist2[nx][ny] <= dist1[pair.x][pair.y] + 1) continue;
                dist1[nx][ny] = dist1[pair.x][pair.y] + 1;
                queue1.add(new EntryPair(nx,ny));
            }
        }

        bw.write("IMPOSSIBLE");
        bw.flush();
        bw.close();
    }
}