import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int x = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];
        int[] occur = new int[2000001];
        int sum = 0;

        StringTokenizer st = new StringTokenizer(s);
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++) {
            if(x-arr[i]>0 && occur[x-arr[i]] == 1) sum++;
            occur[arr[i]] = 1;
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        
    }
}