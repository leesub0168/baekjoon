import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}