import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        
        while(a>0) {
            arr[a%10]++;
            a/=10;
        }
        int max=0;
        for(int i=0;i<10;i++) {
            if(max < arr[i]) {
                max = arr[i];
                if(i == 6 || i==9) {
                    max = (arr[6]+arr[9]+1)/2;
                }
            }
        }
        bw.write(max+"");
        bw.flush();
        bw.close();
    }
}