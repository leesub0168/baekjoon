import java.util.*;
import java.io.*;

public class Main {
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr = new int[10];
    static int[] data;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        data = new int[n];
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            data[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(data);
        
        n_m(0);
        
        System.out.println(sb);
    }
    
    public static void n_m(int k) {
        if(k == m) {
            for(int i=0;i<m;i++) {
                sb.append(data[arr[i]]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int st = 0;
        if(k != 0) st = arr[k-1];
        for(int i=st;i<n;i++) {
            arr[k] = i;
            n_m(k+1);
        }
    }
}