import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n * 2];
        
        StringBuilder sb = new StringBuilder();
        sb.append(fib(n)).append(" ");
        sb.append(fibDP(n));
        
        System.out.print(sb);
    }
    public static int fib(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }
    
    public static int fibDP(int n) {
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        int cnt = 1;
        for(int i = 3; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            cnt++;
        }
        return cnt;
    }
    
    
}