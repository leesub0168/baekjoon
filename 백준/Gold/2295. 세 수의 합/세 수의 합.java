import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        
        int[] sum = new int[n * n];
        int idx = 0;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                sum[idx++] = arr[i] + arr[j];
            }
        }
        Arrays.sort(sum, 0, idx-1);
        
        for(int i=n-1;i>=0;i--) {
            for(int j=i;j>=0;j--) {
                if(Arrays.binarySearch(sum, 0, idx - 1, arr[i] - arr[j]) >= 0) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        
    }
}