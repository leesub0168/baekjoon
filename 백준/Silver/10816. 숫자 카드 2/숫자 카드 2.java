import java.util.*;
import java.io.*;

class BinarySearch {

    public void solution(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++) {
            int x = Integer.parseInt(st.nextToken());
            sb.append(end_idx(arr,x) - start_idx(arr,x)).append(" ");
        }
        System.out.println(sb.toString());
    }
    
    public int start_idx(int[] arr, int target) {
        int st = 0;
        int end = arr.length;
        
        while(st < end) {
            int mid = (st + end) / 2;
            if(arr[mid] >= target) end = mid;
            else st = mid + 1;
        }
        return st;
    }
    
    public int end_idx(int[] arr, int target) {
        int st = 0;
        int end = arr.length;
        
        while(st < end) {
            int mid = (st + end) / 2;
            if(arr[mid] > target) end = mid;
            else st = mid + 1;
        }
        return st;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BinarySearch bs = new BinarySearch();
        bs.solution(br);
    }
}