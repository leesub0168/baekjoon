import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] srr = br.readLine().split(" ");
        
        int n = Integer.parseInt(srr[0]);
        int m = Integer.parseInt(srr[1]);

        int[] arr = new int[n + m];

        String[] nrr = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(nrr[i]);
        }
        String[] mrr = br.readLine().split(" ");
        for(int i=n;i<arr.length;i++) {
            arr[i] = Integer.parseInt(mrr[i-n]);
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}