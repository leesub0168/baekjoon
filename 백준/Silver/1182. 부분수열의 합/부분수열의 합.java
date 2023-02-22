import java.util.*;
import java.io.*;

class Test {
    
    int s;
    int n;
    int cnt = 0;
    int[] subseq = new int[30];
    public int sum_of_subsequence_1182(BufferedReader br) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        String[] sArr = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            subseq[i] = Integer.parseInt(sArr[i]);
        }

        sum_subsequence_fuc(0,0);

        if(s == 0) cnt--;
        
        return cnt;
    }

    public void sum_subsequence_fuc(int cur, int tot) {
        if(cur == n) {
            if(tot == s) cnt++;
            return;
        }
        sum_subsequence_fuc(cur + 1, tot);
        sum_subsequence_fuc(cur + 1, tot+subseq[cur]);
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Test test = new Test();
        System.out.println(test.sum_of_subsequence_1182(br));
    }
}