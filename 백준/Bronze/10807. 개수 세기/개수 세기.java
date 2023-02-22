import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int v = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(s);
        for(int i=0;i<n;i++) {
            int x = Integer.parseInt(st.nextToken());
            if(v == x) cnt++;
        }
        bw.write(cnt+"");
        bw.flush();
        bw.close();
    }
}