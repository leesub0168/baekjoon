import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n+5];
        int[] score = new int[n+5];
        int total = 0;
        for(int i=1; i <= n; i++) {
            score[i] = Integer.parseInt(br.readLine());
            total += score[i];
        }
        if(n < 3) {
            System.out.println(total);
        }else {
            arr[1] = score[1];
            arr[2] = score[2];
            arr[3] = score[3];
        
            for(int i=4; i <= n; i++) {
                arr[i] = Math.min(arr[i-2], arr[i-3]) + score[i];
            }
        
            System.out.println(total - Math.min(arr[n-1], arr[n-2]));
        }
    }
}