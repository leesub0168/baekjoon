import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i * i <= num1; i++) {
            if(num1 % i == 0) {
                list.add(i);
                if(i != (num1 / i)) {
                    list.add(num1 / i);
                }
            }
        }

        Collections.sort(list);
        
        if(list.size() >= num2) {
            System.out.println(list.get(num2-1));
        }else {
            System.out.println(0);
        }
        
    }
}