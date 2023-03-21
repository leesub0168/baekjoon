import java.util.*;
import java.io.*;

class Test {
    public void solution(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());
        int p3 = Integer.parseInt(st.nextToken());
        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int x3 = Integer.parseInt(st.nextToken());
        
        int start = GCD(GCD(p1,p2),p3);
        int last = LCM(LCM(p1,p2),p3);
        
        for(int i=start;i<=last;i++) {
            if(i % p1 == x1 && i % p2 == x2 && i % p3 == x3) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
    
    public int GCD(int num1, int num2) {
        if(num2 == 0) return num1;
        return GCD(num2, num1 % num2);
    }
    
    public int LCM(int num1, int num2) {
        return num1 / GCD(num1, num2) * num2;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Test test = new Test();
        test.solution(br);
    }
}