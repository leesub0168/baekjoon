import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(x > 0) {
            String[] arr = br.readLine().split(" ");
            int num = Integer.parseInt(arr[0]);
            String[] srr = arr[1].split("");
            for(int i=0;i<srr.length;i++) {
                sb.append(srr[i].repeat(num));
            }
            sb.append("\n");
            x--;
        }
        
        System.out.println(sb);
    }
}