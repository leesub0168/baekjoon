import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            int[] arr = new int[101];
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            for(int j=0;j<s1.length();j++) {
                arr[s1.charAt(j)-97]++;
            }
            for(int j=0;j<s2.length();j++) {
                arr[s2.charAt(j)-97]--;
            }
            boolean flag = true;
            for(int x : arr) {
                if(x != 0) flag = false;
            }
            if(flag) {
                bw.write("Possible\n");
            }else {
                bw.write("Impossible\n");
            }
        }
        
        bw.flush();
        bw.close();
        
    }
}