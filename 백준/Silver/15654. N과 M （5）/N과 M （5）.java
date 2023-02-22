import java.util.*;
import java.io.*;

public class Main {
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    static boolean[] isUsed = new boolean[10];
    static int[] arr = new int[10];
    static int[] data;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        data = new int[n];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            data[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(data);

        n_and_m_func_5(0);

        System.out.println(sb);
    }
    
    public static void n_and_m_func_5(int k) {
        if(k == m) {
            for(int i=0;i<m;i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=0;i<n;i++) {
            if(!isUsed[i]) {
                arr[k] = data[i];
                isUsed[i] = true;
                n_and_m_func_5(k+1);
                isUsed[i] = false;
            }
        }
    }
}