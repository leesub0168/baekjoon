import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[301][3];
        int[] score = new int[301];
        
        for(int i=1; i <= n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }
        if(n == 1) {
            System.out.println(score[n]);
        }else {
            arr[1][1] = score[1];
            arr[1][2] = 0;
            arr[2][1] = score[2];
            arr[2][2] = score[1] + score[2];
        
            for(int i = 3; i <= n; i++) {
                arr[i][1] = Math.max(arr[i-2][1], arr[i-2][2]) + score[i];
                arr[i][2] = arr[i-1][1] + score[i];
            }
            System.out.println(Math.max(arr[n][1], arr[n][2]));
        }
        
    }
}