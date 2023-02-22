import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int sum = a*b*c;
        int[] arr = new int[10];

        while(sum > 0) {
            arr[sum%10]++;
            sum/=10;
        }
        for(int i=0;i<10;i++) {
            bw.write(arr[i]+"\n");
        }

        bw.flush();
        bw.close();
    }
}