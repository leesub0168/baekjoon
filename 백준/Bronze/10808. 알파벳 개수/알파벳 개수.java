import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++) {
            int c = s.charAt(i);
            arr[c-97] += 1;
        }
        for(int i:arr) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }
}