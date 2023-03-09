import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            int answer = 1;
            int m = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for(int j=0;j<m;j++) {
                String s = br.readLine().split(" ")[1];
                int x = 0;
                if(map.containsKey(s)) {
                    x = map.get(s);
                }
                x++;
                map.put(s, x);
            }
            for (String s : map.keySet()) {
                answer *= (map.get(s) + 1);
            }
            answer -= 1;
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}