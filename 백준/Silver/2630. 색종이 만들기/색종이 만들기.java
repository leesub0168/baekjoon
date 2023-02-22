import java.util.*;
import java.io.*;

class Test {
    int[][] arr = new int[128][128];
    int[] res = new int[2];
    public int[] color_paper_2630(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String[] st = br.readLine().split(" ");
            for(int j=0;j<n;j++) {
                arr[i][j] = Integer.parseInt(st[j]);
            }
        }
        recursColor(0,0,n);
        
        return res;
    }
    public void recursColor(int x, int y, int z) {
        if(check(x,y,z)) {
            res[arr[x][y]] += 1;
            return;
        }
        int n = z/2;
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                recursColor(x+i*n, y+j*n,n);
            }
        }
    }
    public boolean check(int x, int y, int n) {
        for(int i=x;i<x+n;i++) {
            for(int j=y;j<y+n;j++) {
                if(arr[x][y] != arr[i][j]) return false;
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Test test = new Test();
        int[] res = test.color_paper_2630(br);
        
        for(int i=0;i<2;i++) {
            bw.write(res[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
    
}