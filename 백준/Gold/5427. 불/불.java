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
        String s;
        int n;
        int m;
        char[][] board = new char[1002][1002];;
        int[][] dist1 = new int[1002][1002];;
        int[][] dist2 = new int[1002][1002];;
        while (cnt > 0) {
            cnt--;
            s = br.readLine();
            n = Integer.parseInt(s.split(" ")[0]);
            m = Integer.parseInt(s.split(" ")[1]);

            Queue<EntryPair> queue1 = new ArrayDeque<>();
            Queue<EntryPair> queue2 = new ArrayDeque<>();

            for(int i=0;i<m;i++) {
                String tmp = br.readLine();
                for(int j=0;j<n;j++) {
                    board[i][j] = tmp.charAt(j);
                    dist1[i][j] = -1;
                    dist2[i][j] = -1;
                    if(board[i][j] == '@') {
                        dist2[i][j] = 0;
                        queue2.add(new EntryPair(i,j));
                    }
                    if(board[i][j] == '*') {
                        dist1[i][j] = 0;
                        queue1.add(new EntryPair(i,j));
                    }
                }
            }

            int[] dx = {1,0,-1,0};
            int[] dy = {0,1,0,-1};

            while (!queue1.isEmpty()) {
                EntryPair pair = queue1.remove();
                for(int i=0;i<dx.length;i++) {
                    int nx = pair.x + dx[i];
                    int ny = pair.y + dy[i];
                    if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
                    if(dist1[nx][ny] >= 0 || board[nx][ny] == '#') continue;
                    dist1[nx][ny] = dist1[pair.x][pair.y] + 1;
                    queue1.add(new EntryPair(nx,ny));
                }
            }
            boolean flag = false;
            while (!queue2.isEmpty() && !flag) {
                EntryPair pair = queue2.remove();
                for(int i=0;i<dx.length;i++) {
                    if(flag) continue;
                    int nx = pair.x + dx[i];
                    int ny = pair.y + dy[i];
                    if(nx < 0 || ny < 0 || nx >= m || ny >= n) {
                        bw.write((dist2[pair.x][pair.y] + 1)+"\n");
                        flag = true;
                    }
                    if(!flag){
                        if(dist2[nx][ny] >= 0 || board[nx][ny] == '#') continue;
                        if(dist1[nx][ny] != -1 &&  dist1[nx][ny] <= dist2[pair.x][pair.y] + 1) continue;
                        dist2[nx][ny] = dist2[pair.x][pair.y] +1;
                        queue2.add(new EntryPair(nx,ny));
                    }
                }
            }

            if(!flag) {
                bw.write("IMPOSSIBLE\n");
            }
        }
        bw.flush();
        bw.close();
        
    }
}