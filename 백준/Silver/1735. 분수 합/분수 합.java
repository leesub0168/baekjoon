import java.util.*;
import java.io.*;

public class Main {
    public static int GCD(int num1, int num2) {
        if(num2 == 0) return num1;
        return GCD(num2, num1 % num2);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int num3 = Integer.parseInt(st.nextToken());
        int num4 = Integer.parseInt(st.nextToken());
        
        int numerator = (num1 * num4) + (num2 * num3);
        int denominator = num2 * num4;
        
        int gcd = GCD(numerator, denominator);
        
        numerator /= gcd;
        denominator /= gcd;
        
        
        System.out.println(numerator + " " + denominator);
    }
}