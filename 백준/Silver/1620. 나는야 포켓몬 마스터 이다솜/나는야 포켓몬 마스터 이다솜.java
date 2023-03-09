import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] srr = br.readLine().split(" ");
        int n = Integer.parseInt(srr[0]);
        int m = Integer.parseInt(srr[1]);
        String[] arr = new String[n+1];
        Map<String, Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++) {
            String s = br.readLine();
            arr[i] = s;
            map.put(s, i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++) {
            String s = br.readLine();
            if (Character.isDigit(s.charAt(0))) {
                sb.append(arr[Integer.parseInt(s)]).append("\n");
            } else {
                sb.append(map.get(s)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}