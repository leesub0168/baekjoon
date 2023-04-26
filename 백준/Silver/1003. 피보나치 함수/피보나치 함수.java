import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int[][] arr = new int[42][2];
        
        arr[0][0] = 1;
        arr[1][1] = 1;
        
        for(int i = 2; i <= 40; i++) {
            arr[i][0] = arr[i-1][0] + arr[i-2][0];
            arr[i][1] = arr[i-1][1] + arr[i-2][1];
        }
        
        
        StringBuilder sb = new StringBuilder();
        while(tc > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n][0] + " " + arr[n][1] + "\n");
            
            tc--;
        }
        System.out.println(sb);
    }
}