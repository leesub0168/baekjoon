import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[][] arr = new int[2][26];

        String s1 = br.readLine();
        String s2 = br.readLine();

        for(int i=0;i<s1.length();i++) {
            arr[0][s1.charAt(i) - 'a']++;
        }
        for(int i=0;i<s2.length();i++) {
            arr[1][s2.charAt(i) - 'a']++;
        }

        int cnt = 0;
        for(int i=0;i<26;i++) {
            cnt += Math.abs(arr[0][i] - arr[1][i]);
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
        
    }
}