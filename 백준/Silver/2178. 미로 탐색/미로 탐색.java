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
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        int[][] board = new int[n+1][m+1];
        boolean[][] vis = new boolean[n+1][m+1];

        for(int i=0;i<n;i++) {
            String s = br.readLine();
            for(int j=0;j<m;j++) {
                board[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }
        Queue<EntryPair> deque = new LinkedList<>();
        deque.add(new EntryPair(0,0));
        vis[0][0] = true;

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        while (!deque.isEmpty()) {
            EntryPair pair = deque.remove();
            for(int dir=0;dir<4;dir++) {
                int xx = pair.x + dx[dir];
                int yy = pair.y + dy[dir];

                if(xx >= 0 && yy >= 0 && xx < m && yy < n) {
                    if(board[yy][xx] != 0 && !vis[yy][xx]) {
                        vis[yy][xx] = true;
                        board[yy][xx] = board[pair.y][pair.x] + 1;
                        deque.add(new EntryPair(xx,yy));
                    }
                }
            }
        }

        bw.write(board[n-1][m-1]+"");
        bw.flush();
        bw.close();
        
    }
}