import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[2][6];
        
        for(int i=0;i<n;i++) {
            String tmp = br.readLine();
            st = new StringTokenizer(tmp);
            arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())-1]++;
        }
        int cnt = 0;
        for(int i=0;i<2;i++) {
            for(int j=0;j<6;j++) {
                cnt += ((arr[i][j] + 1)/ 2);
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}