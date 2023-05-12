import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        int cnt = 0;
        for (int i = 1; i <= num1; i++) {
            if(num1 % i == 0) {
                cnt++;
                if(cnt == num2) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
        
    }
}