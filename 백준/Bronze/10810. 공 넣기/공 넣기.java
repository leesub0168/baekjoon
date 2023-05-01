import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[102];
        
        while (m > 0) {
            st = new StringTokenizer(br.readLine());
            
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            for(int start = i; i <= j; i++) {
                arr[i] = k;
            }
            
            m--;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i <= n; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
    }
}