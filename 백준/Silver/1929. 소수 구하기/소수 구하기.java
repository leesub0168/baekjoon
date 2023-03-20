import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        
        List<Integer> list = new ArrayList<>();
        boolean[] state = new boolean[2000001];
        Arrays.fill(state, true);
        state[1] = false;
        StringBuilder sb = new StringBuilder();
        for(int i=2;i*i<=max;i++){
            if(!state[i]) continue;
            for(int j=i*i;j<=max;j+=i) {
                state[j] = false;
            }
        }
        
        for(int i=min;i<=max;i++) {
            if(state[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}