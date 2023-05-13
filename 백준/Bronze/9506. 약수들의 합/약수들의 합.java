import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            
            if(num1 == -1) break;
            
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for(int i=1; i * i <= num1; i++) {
                if(num1 % i == 0) {
                    list.add(i);
                    sum += i;
                    
                    if(i != (num1 / i) && (num1 / i) != num1) {
                        list.add(num1 / i);
                        sum += (num1 / i);
                    }
                }
            }
            Collections.sort(list);
            
            if(sum == num1) {
                sb.append(num1 + " = ");
                for(int i=0; i < list.size(); i++) {
                    sb.append(list.get(i));
                    if(i < list.size() - 1) sb.append(" + ");
                }
                sb.append("\n");
            }else {
                sb.append(num1 + " is NOT perfect.\n");
            }
        }
        System.out.println(sb);
    }
}