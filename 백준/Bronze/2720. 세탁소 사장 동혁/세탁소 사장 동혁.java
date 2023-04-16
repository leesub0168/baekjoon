import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            int quarter = 25;
            int dime = 10;
            int nickel = 5;
            int penny = 1;
            
            int cash = Integer.parseInt(br.readLine());
            int remain = cash;
            remain = remain % quarter;
            sb.append(cash / quarter).append(" ");
            sb.append(remain / dime).append(" ");
            remain = remain % dime;
            
            sb.append(remain / nickel).append(" ");
            remain = remain % nickel;
            sb.append(remain / penny).append("\n");
        }
        System.out.println(sb);
    }
}