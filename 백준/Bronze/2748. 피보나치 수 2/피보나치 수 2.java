import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[91];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        
        for(int i=3; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        
        System.out.println(arr[n]);
    }
}