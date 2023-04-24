import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        while(cnt > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[12];
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;
        
            for(int i = 4; i <= n; i++) {
                arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
            }
        
            System.out.println(arr[n]);
            cnt--;
        }
    }
}