
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
        int num = scanner.nextInt();
        int defaultNum = scanner.nextInt();
        for(int i=0;i<num;i++) {
            int x = scanner.nextInt();
            if(x < defaultNum) {
                System.out.print(x + " ");
            }
        }
    }
}