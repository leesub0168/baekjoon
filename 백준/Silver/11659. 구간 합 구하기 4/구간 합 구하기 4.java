import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+5];
        
        st = new StringTokenizer(br.readLine()); 
        for(int i=1; i <= n ; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        while(m > 0) {
            st = new StringTokenizer(br.readLine()); 
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            sb.append(arr[j] - arr[i-1]).append("\n");
            
            m--;
        }
        System.out.println(sb);
    }
}