import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int m;
    static int[] arr = new int[10];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] sArr = br.readLine().split(" ");
        n = Integer.parseInt(sArr[0]);
        m = Integer.parseInt(sArr[1]);

        n_m_func3(0);

        System.out.println(sb);
        
    }
    public static void n_m_func3(int k){
        if(k == m){
            for(int i=0;i<m;i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int st = 1;
        if(k != 0) st = arr[k-1];
        for(int i=st;i<=n;i++) {
            arr[k] = i;
            n_m_func3(k+1);
        }
    }
}