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
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0;i<k;i++) {
            String s = br.readLine();
            int x1 = Integer.parseInt(s.split(" ")[0]);
            int y1 = Integer.parseInt(s.split(" ")[1]);
            int x2 = Integer.parseInt(s.split(" ")[2]);
            int y2 = Integer.parseInt(s.split(" ")[3]);

            for(int j=0;j<n;j++) {
                for(int h=0;h<m;h++) {
                    if(h >= x1 && j >= y1 && h < x2 && j < y2) {
                        board[j][h] = 1;
                    }
                }
            }
        }
        int area = 0;

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(board[i][j] == 1 || vis[i][j]) continue;
                area++;

                Queue<EntryPair> queue = new ArrayDeque<>();
                vis[i][j] = true;
                queue.add(new EntryPair(i,j));
                int sum = 0;
                while (!queue.isEmpty()) {
                    sum++;
                    EntryPair pair = queue.remove();
                    for(int dir=0;dir<4;dir++) {
                        int nx = pair.x + dx[dir];
                        int ny = pair.y + dy[dir];
                        if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                        if(vis[nx][ny] || board[nx][ny] == 1) continue;
                        vis[nx][ny] = true;
                        queue.add(new EntryPair(nx,ny));
                    }
                }
                list.add(sum);
            }
        }
        bw.write(area+"\n");

        Collections.sort(list);

        for(int i=0;i<list.size();i++) {
            bw.write(list.get(i) + " ");
        }

        bw.flush();
        bw.close();
    }
}