import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[] lotto;
    static int[] lotto_arr = new int[6];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = "";
        StringTokenizer st;
        while(!s.equals("0")) {
            s = br.readLine();
            st = new StringTokenizer(s);
            n = Integer.parseInt(st.nextToken());
            
            lotto = new int[n];
            
            for(int i=0;i<n;i++) {
                lotto[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(lotto);
            
            lotto(0,0);
            sb.append("\n");
        }
        System.out.println(sb);
        
        
    }
    public static void lotto(int k, int st) {
        if(k == 6) {
            for(int i=0;i<6;i++) {
                sb.append(lotto_arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=st;i<n;i++) {
            lotto_arr[k] = lotto[i];
            lotto(k+1,i+1);
        }
    }
}