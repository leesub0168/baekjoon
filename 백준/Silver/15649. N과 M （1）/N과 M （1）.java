import java.util.*;
import java.io.*;

class Test {
    
    int[] arr = new int[10];
    boolean[] isUsed = new boolean[10];
    int n, m;
    public void n_and_m(BufferedReader br, BufferedWriter bw) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        n_and_m_func(0, bw);

        bw.flush();
        bw.close();

    }

    public void n_and_m_func(int k, BufferedWriter bw) throws IOException{
        if(k == m) {
            for(int i=0;i<m;i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }
        for(int i=1;i<=n;i++) {
            if(!isUsed[i]) {
                arr[k] = i;
                isUsed[i] = true;
                n_and_m_func(k+1, bw);
                isUsed[i] = false;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Test test = new Test();
        test.n_and_m(br,bw);
    }
}