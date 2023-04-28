import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n+1][3];
        int[] red = new int[n+1];
        int[] green = new int[n+1];
        int[] blue = new int[n+1];
        
        for(int i=1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            red[i] = Integer.parseInt(st.nextToken());
            green[i] = Integer.parseInt(st.nextToken());
            blue[i] = Integer.parseInt(st.nextToken());
        }
        
        arr[1][0] = red[1];
        arr[1][1] = green[1];
        arr[1][2] = blue[1];
        
        for(int i=2; i <= n; i++) {
            arr[i][0] = Math.min(arr[i-1][1], arr[i-1][2]) + red[i];
            arr[i][1] = Math.min(arr[i-1][0], arr[i-1][2]) + green[i];
            arr[i][2] = Math.min(arr[i-1][0], arr[i-1][1]) + blue[i];
        }
        
        System.out.println(Math.min(Math.min(arr[n][0], arr[n][1]),arr[n][2]));
    }
}