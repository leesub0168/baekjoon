import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, String> maps = new HashMap<>();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            String key = br.readLine();
            maps.put(key, key);
        }
        int cnt = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            String key = br.readLine();
            if(maps.containsKey(key)) {
                cnt++;
                list.add(key);
            }
        }
        
        Collections.sort(list);
        sb.append(cnt + "\n");
        
        for(String str : list) {
            sb.append(str + "\n");
        }
        System.out.println(sb);
    }
}