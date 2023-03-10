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
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                list.add(arr[i] + arr[j]);
            }
        }
        Collections.sort(list);
        
        for(int i=n-1;i>=0;i--) {
            for(int j=i;j>=0;j--) {
                if(Collections.binarySearch(list, arr[i] - arr[j]) >= 0) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        
    }
}