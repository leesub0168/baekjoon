import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int[] arr = new int[15];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        
        for(int i=4; i <= 11; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        StringBuilder sb = new StringBuilder();
        while(tc > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n]+"\n");
            tc--;
        }
        System.out.println(sb);
    }
}