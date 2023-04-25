import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n + 5];
        int[] step = new int[n + 5];
        
        arr[2] = 1;
        arr[3] = 1;
        
        step[2] = 1;
        step[3] = 1;
        
        for(int i=4; i <= n; i++) {
            arr[i] = arr[i-1] + 1;
            step[i] = i-1;
            
            if(i % 3 == 0 && arr[i] > arr[i / 3] + 1) {
                arr[i] = arr[i / 3] + 1;
                step[i] = i / 3;
            }
            if(i % 2 == 0 && arr[i] > arr[i / 2] + 1) {
                arr[i] = arr[i / 2] + 1;
                step[i] = i / 2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(arr[n]).append("\n");
        sb.append(n).append(" ");
        
        while (n > 1) {
            sb.append(step[n]).append(" ");
            n = step[n];
        }
        System.out.println(sb);
    }
}