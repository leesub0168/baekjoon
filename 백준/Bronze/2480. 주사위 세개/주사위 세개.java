import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        Arrays.sort(arr);

        if(arr[0] == arr[2]) {
            System.out.println(10000 + (arr[0] * 1000));
            return;
        }
        if(arr[0] == arr[1] || arr[1] == arr[2]) {
            System.out.println(1000 + (arr[1] * 100));
            return;
        }

        System.out.println(arr[2] * 100);
    }
}