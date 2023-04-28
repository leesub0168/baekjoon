import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n+5];
        arr[2] = 1;
        for(int i=3; i <= n; i++) {
            arr[i] = arr[i - 1] + 1;
            if(i % 3 == 0) arr[i] = Math.min(arr[i / 3] + 1, arr[i]);
            if(i % 2 == 0) arr[i] = Math.min(arr[i / 2] + 1, arr[i]);
        }
        System.out.println(arr[n]);
    }
}