import java.util.*;
import java.io.*;

class Test {
    
    int n;
    int cnt = 0;
    boolean[] isused1 = new boolean[40];
    boolean[] isused2 = new boolean[40];
    boolean[] isused3 = new boolean[40];
    public int n_queen_9663(int k) throws IOException {
        n = k;

        n_queen_func(0);

        return cnt;
    }

    public void n_queen_func(int cur) {
        if(n == cur) {
            cnt++;
            return;
        }
        for(int i=0;i<n;i++) {
            if(isused1[i] || isused2[i+cur] || isused3[cur-i+n-1]) continue;
            isused1[i] = true;
            isused2[i+cur] = true;
            isused3[cur-i+n-1] = true;
            n_queen_func(cur+1);
            isused1[i] = false;
            isused2[i+cur] = false;
            isused3[cur-i+n-1] = false;
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Test test = new Test();
        System.out.println(test.n_queen_9663(n));
    }
}