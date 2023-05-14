import java.util.*;
import java.io.*;

class Test {
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
        int n = Integer.parseInt(br.readLine());
        Test test = new Test();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            
            sb.append(test.LCM(num1, num2)+"\n");
        }
        System.out.println(sb);
    }
}