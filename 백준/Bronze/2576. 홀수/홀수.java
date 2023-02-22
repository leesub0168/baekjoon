import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0, min = Integer.MAX_VALUE;
        for(int i=0;i<7;i++) {
            int num = sc.nextInt();
            if(num % 2 != 0) {
                sum += num;
                if(min > num) min = num;
            }
        }
        if(sum > 0) {
            System.out.println(sum);
            System.out.println(min);
        }else {
            System.out.println(-1);
        }
    }
}