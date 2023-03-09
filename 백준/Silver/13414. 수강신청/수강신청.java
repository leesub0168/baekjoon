import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] srr = br.readLine().split(" ");
        int n = Integer.parseInt(srr[0]);
        int m = Integer.parseInt(srr[1]);

        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<m;i++) {
            String s = br.readLine();
            map.put(s, i);
        }
        String[] arr = new String[m];
        for (String key : map.keySet()) {
            int idx = map.get(key);
            arr[idx] = key;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++) {
            if(n <= 0) break;
            if(arr[i] != null) {
                sb.append(arr[i]).append("\n");
                n--;
            }
        }
        System.out.println(sb.toString());
    }
}