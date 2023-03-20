import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        
        while(testCase > 0) {
            testCase--;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            bw.write(inca(n,m,x,y)+"\n");
        }        
        bw.flush();
        bw.close();
    }
    public static int GCD(int num1, int num2) {
        if(num2 == 0) return num1;
        return GCD(num2, num1 % num2);
    }
    public static int LCM(int num1, int num2) {
        return num1 / GCD(num1, num2) * num2;
    }
    public static int inca(int n, int m, int x, int y) {
        if(x == n) x = 0;
        if(y == m) y = 0;
        int last = LCM(n,m);
        for(int i=x; i<=last; i+=n){
            if(i == 0) continue;
            if(i % m == y) return i;
        }
        return -1;
    }
}