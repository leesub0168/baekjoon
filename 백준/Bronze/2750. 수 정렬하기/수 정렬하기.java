
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<num;i++) {
            for(int j=0;j<num;j++) {
                if(arr[i] < arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }

        for(int i=0;i<num;i++) {
            System.out.println(arr[i]);
        }
    }
}