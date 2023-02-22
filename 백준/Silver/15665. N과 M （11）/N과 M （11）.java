import java.util.*;
import java.io.*;

public class Main {
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr = new int[10];
    static int[] data;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++) {
            set.add(Integer.parseInt(st1.nextToken()));
        }
        n = set.size();
        data = set.stream().mapToInt(Integer::intValue).toArray();
        
        n_and_m(0);
        
        System.out.println(sb);
    }
    

    public static void n_and_m(int k) {
        if(k == m) {
            for(int i=0;i<m;i++) {
                sb.append(data[arr[i]]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<n;i++) {
            arr[k] = i;
            n_and_m(k + 1);
        }
    }
}