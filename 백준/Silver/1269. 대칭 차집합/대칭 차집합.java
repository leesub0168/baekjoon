import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        Map<String, String> maps = new HashMap<>(); 
        for(int i = 0; i < n; i++) {
            String str = st.nextToken();
            maps.put(str, str);
        }
        
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            String str = st.nextToken();
            if(maps.containsKey(str)) {
                cnt++;
            }
        }
        
        System.out.println((n - cnt) + (m - cnt));
    }
}