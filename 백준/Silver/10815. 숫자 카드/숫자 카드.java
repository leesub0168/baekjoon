import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int x = 10_000_000;
        int[] arr = new int[x * 2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[x + Integer.parseInt(st.nextToken())]++;
        }

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) {
            sb.append(arr[x + Integer.parseInt(st.nextToken())]).append(" ");
        }
        System.out.println(sb);
    }
}