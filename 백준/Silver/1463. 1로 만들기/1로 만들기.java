import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n+1];
        for(int i=2; i <= n; i++) {
            int divide_3 = Integer.MAX_VALUE;
            int divide_2 = Integer.MAX_VALUE;
            int minus_1 = arr[i-1] + 1;
            if(i % 3 == 0) divide_3 = arr[i / 3] + 1;
            if(i % 2 == 0) divide_2 = arr[i / 2] + 1;
            
            arr[i] = Math.min(Math.min(divide_3, divide_2), minus_1);
        }
        System.out.println(arr[n]);
    }
}