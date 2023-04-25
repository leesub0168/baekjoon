import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] arr = new int[cnt+1][3];
        int[] red = new int[cnt];
        int[] green = new int[cnt];
        int[] blue = new int[cnt];
        
        for(int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            red[i] = Integer.parseInt(st.nextToken());
            green[i] = Integer.parseInt(st.nextToken());
            blue[i] = Integer.parseInt(st.nextToken());
        }
        
        arr[1][0] = red[0];
        arr[1][1] = green[0];
        arr[1][2] = blue[0];
        
        for(int i = 2; i <= cnt; i++) {
            arr[i][0] = Math.min(arr[i-1][1], arr[i-1][2]) + red[i-1];
            arr[i][1] = Math.min(arr[i-1][0], arr[i-1][2]) + green[i-1];
            arr[i][2] = Math.min(arr[i-1][0], arr[i-1][1]) + blue[i-1];
        }
        System.out.println(Math.min(Math.min(arr[cnt][0], arr[cnt][1]),arr[cnt][2]));
    }
}