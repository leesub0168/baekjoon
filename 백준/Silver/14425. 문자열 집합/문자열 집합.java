import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, String> maps = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String key = br.readLine();
            maps.put(key, key);
        }
        
        int cnt = 0;        
        for(int i = 0; i < m; i++) {
            String key = br.readLine();
            if(maps.containsKey(key)) cnt++;
        }
        
        System.out.println(cnt);
    }
}