import java.util.*;
import java.io.*;

public class Main {
    public static boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i=2;i*i<=n;i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(n > 0) {
            n--;
            int num = Integer.parseInt(st.nextToken());
            if(isPrime(num)) count++;
        }
        System.out.println(count);
    }
}