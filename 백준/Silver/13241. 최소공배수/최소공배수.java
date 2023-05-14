import java.util.*;
import java.io.*;

class Test {
    public long GCD(long num1, long num2) {
        if(num2 == 0) return num1;
        return GCD(num2, num1 % num2);
    }
    
    public long LCM(long num1, long num2) {
        return num1 * num2 / GCD(num1, num2);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Test test = new Test();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long num1 = Long.valueOf(st.nextToken());
        long num2 = Long.valueOf(st.nextToken());
        
        System.out.println(test.LCM(num1, num2));
    }
}