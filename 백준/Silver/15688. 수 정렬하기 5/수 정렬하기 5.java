import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2000001];
        for(int i=0;i<n;i++) {
            int x = Integer.parseInt(br.readLine()); 
            arr[x + 1000000]++;
        }
        
        for(int i=0;i<arr.length;i++) {
            int num = arr[i];
            if(num > 0) {
                while(num > 0) {
                    bw.write((i - 1000000)+"\n");
                    num--;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}