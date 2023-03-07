import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        for(int i=0;i<n;i++) {
            arr[i] = Long.valueOf(br.readLine());
        }
        Arrays.sort(arr);

        int cnt = 0;
        long mxVal = -Double.doubleToLongBits(Math.pow(-2, 62)) - 1;
        int mxCnt = 0;

        for(int i=0;i<n;i++) {
            if(i == 0 || arr[i-1] == arr[i]) cnt++;
            else {
                if(cnt > mxCnt) {
                    mxCnt = cnt;
                    mxVal = arr[i-1];
                }
                cnt = 1;
            }
        }
        if(cnt > mxCnt) mxVal = arr[n-1];
        System.out.println(mxVal);
    }
}