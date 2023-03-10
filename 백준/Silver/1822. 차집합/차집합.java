import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] srr = br.readLine().split(" ");
        int n = Integer.parseInt(srr[0]);
        int m = Integer.parseInt(srr[1]);

        int[] arrA = new int[n];
        int[] arrB = new int[m];

        String[] tmp = br.readLine().split(" ");
        for (int i=0;i<n;i++) {
            arrA[i] = Integer.parseInt(tmp[i]);
        }

        String[] tmpB = br.readLine().split(" ");
        for (int i=0;i<m;i++) {
            arrB[i] = Integer.parseInt(tmpB[i]);
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++) {
            if(Arrays.binarySearch(arrB, arrA[i]) < 0) list.add(arrA[i]);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        for (Integer x : list) {
            sb.append(x).append(" ");
        }
        System.out.println(sb);
    }
}