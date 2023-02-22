import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int num3;

        
       if(num1 > num2){
           num3 = num2;
           num2 = num1;
           num1 = num3;
       }
       if(num1 == num2) {
           num3 = 0;
       }else {
           num3 = num2 - num1 -1;
       }
       int[] arr = new int[num3];

        int idx = 0;
       for(int i=num1+1;i<num2;i++) {
            arr[idx] = i;
            idx++;
       }

       Arrays.sort(arr);
       System.out.println(arr.length);
       for(int i=0;i<arr.length;i++) {
           System.out.print(arr[i] + " ");
       }
    }
}