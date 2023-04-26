import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1005];
        
        arr[1] = 1;
        arr[2] = 3;
        
        for(int i=3; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2] + arr[i-2]) % 10007;
        }
        System.out.println(arr[n]);
    }
}