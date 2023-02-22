import java.util.*;
import java.io.*;

class Test {
    
    int[][] arr = new int[2200][2200];
    int[] res = new int[3];
    public void paper_count_1780(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String[] st = br.readLine().split(" ");
            for(int j=0;j<n;j++) {
                arr[i][j] = Integer.parseInt(st[j]);
            }
        }
        recurs1(0,0,n);
        for(int i=0;i<3;i++) {
            bw.write(res[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
    
    public void recurs1(int x, int y, int z) {
        if(check(x,y,z)) {
            res[arr[x][y] +1] += 1;
            return;
        }
        int n = z/3;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                recurs1(x+i*n, y+j*n,n);
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
        test.paper_count_1780(br,bw);
    }
}