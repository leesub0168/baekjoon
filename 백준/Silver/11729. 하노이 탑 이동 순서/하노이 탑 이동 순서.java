import java.util.*;
import java.io.*;

public class Main {
    public static void hanoi_tower(int a, int b, int n, BufferedWriter bw) throws IOException {
        if(n == 1) {
            bw.write(a + " " + b + "\n");
            return;
        }
        hanoi_tower(a, 6-a-b, n-1,bw);
        bw.write(a + " " + b + "\n");
        hanoi_tower(6-a-b, b, n-1,bw);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        bw.write(((int)Math.pow(2,n) -1) + "\n");
        
        hanoi_tower(1,3,n,bw);
        bw.flush();
        bw.close();
    }
}