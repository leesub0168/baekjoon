import java.util.*;
import java.io.*;

public class Main {
    public static int func(int r, int c, int n) {
        if(n == 0) return 0;
        int half = (int)Math.pow(2,n-1);
        if(r < half && c < half) return func(r,c,n-1);
        if(r < half && c >= half) return half*half + func(r,c-half,n-1);
        if(r >= half && c < half) return 2*half*half + func(r-half,c,n-1);
        return 3 * half * half + func(r-half, c-half, n-1);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write(func(r,c,n)+"");
        bw.flush();
        bw.close();
        
    }
}