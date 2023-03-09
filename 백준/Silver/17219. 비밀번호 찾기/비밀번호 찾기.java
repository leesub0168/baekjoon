import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] srr = br.readLine().split(" ");
        int n = Integer.parseInt(srr[0]);
        int m = Integer.parseInt(srr[1]);

        HashMap<String, String> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            String[] s = br.readLine().split(" ");
            map.put(s[0], s[1]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<m;i++) {
            sb.append(map.get(br.readLine())).append("\n");
        }
        System.out.println(sb.toString());
    }
}