import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n > 1) {
            StringBuilder sb = new StringBuilder();
            for(int i = 2; i * i <= n; i++) {
                while(n % i == 0) {
                    sb.append(i+"\n");
                    n /= i;
                }
            }
            if(n != 1) sb.append(n);
            System.out.println(sb);
        }
    }
}