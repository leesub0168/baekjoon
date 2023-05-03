import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ans = 0;
        
        int[] arr = new int[n+1];
        for(int i=0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i=n-1; i >= 0; i--) {
            ans += (k / arr[i]);
            k %= arr[i];
            if(k == 0) break;
        }
        System.out.println(ans);
    }
}