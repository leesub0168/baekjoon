import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        int total = 0;
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            
            total += (price * count);
        }
        if(sum == total) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}