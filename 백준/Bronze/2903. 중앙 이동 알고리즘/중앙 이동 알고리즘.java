import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[16];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 9;
        
        for(int i=4; i < 16; i++) {
            arr[i] = arr[i-1] + arr[i-1] - 1; 
        }
        
        System.out.println(arr[n] * arr[n]);
    }
}