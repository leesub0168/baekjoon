import java.util.*;
import java.io.*;
class PrimeNumber {
    public boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i=2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        PrimeNumber primeNumber = new PrimeNumber();
        
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=n; i <= m; i++) {
            if(primeNumber.isPrime(i)) {
                list.add(i);
                sum += i;
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}