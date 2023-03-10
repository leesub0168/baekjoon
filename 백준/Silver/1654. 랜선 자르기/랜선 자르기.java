import java.util.*;
import java.io.*;

class Test {
    int n, k;
    int[] arr = new int[10005];
    public void solution(BufferedReader br) throws Exception {
        String[] srr = br.readLine().split(" ");
        k = Integer.parseInt(srr[0]);
        n = Integer.parseInt(srr[1]);
        for (int i=0;i<k;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long st = 1;
        long en = Integer.MAX_VALUE;
        while (st < en) {
            long mid = (st + en + 1) / 2;
            if(solve(mid)) st = mid;
            else en = mid -1;
        }
        System.out.println(st);
    }
    public boolean solve(long x) {
        long cur = 0;
        for (int i=0;i<k;i++) {
            cur += arr[i] / x;
        }
        return cur >= n;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Test test = new Test();
        test.solution(br);
    }
}