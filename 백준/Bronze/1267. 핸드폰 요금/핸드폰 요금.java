import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int callCount = sc.nextInt();
        int[] arr = new int[callCount];
        for(int i=0;i<callCount;i++) {
            arr[i] = sc.nextInt();
        }

        int priceY = 0;
        int priceM = 0;

        for(int i=0;i<callCount;i++) {
            int y = (int) Math.ceil(arr[i] / 30.0);
            int m = (int) Math.ceil(arr[i] / 60.0);

            if(arr[i] % 30 == 0) y++;
            if(arr[i] % 60 == 0) m++;

            priceY += (y * 10);
            priceM += (m * 15);
        }

        if(priceY == priceM) {
            System.out.print("Y M " + priceM);
            return;
        }
        if(priceY < priceM) {
            System.out.print("Y " + priceY);
            return;
        }
        if(priceM < priceY) {
            System.out.print("M " + priceM);
        }
        
    }
}