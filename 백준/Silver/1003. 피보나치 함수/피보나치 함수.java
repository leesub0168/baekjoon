import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int[] arr = new int[42];
        
        arr[1] = 1;
        arr[2] = 1;
        
        for(int i = 3; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        
        
        StringBuilder sb = new StringBuilder();
        while(tc > 0) {
            int n = Integer.parseInt(br.readLine());
            
            if(n == 0) {
                sb.append("1 0\n");
            }else {
                sb.append(arr[n-1] + " " + arr[n] + "\n");
            }
            
            tc--;
        }
        System.out.println(sb);
    }
}