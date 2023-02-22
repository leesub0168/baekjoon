import java.util.*;
import java.io.*;

class Test {
    
    int n, m;
    int[] arr = new int[10];
    public void n_and_m_2_15650(BufferedReader br, BufferedWriter bw) throws IOException {
        String[] sArr = br.readLine().split(" ");
        n = Integer.parseInt(sArr[0]);
        m = Integer.parseInt(sArr[1]);

        n_m_func2(0,bw);

        bw.flush();
        bw.close();

    }

    boolean[] isUsed = new boolean[10];
    List<Integer> list = new ArrayList<>();
    public void n_m_func2(int k, BufferedWriter bw) throws IOException{
        if(k == m){
            for(int i=0;i<m;i++) {
                bw.write(arr[i]+" ");
            }
            bw.write("\n");
            return;
        }

        int st = 1;
        if(k != 0) st = arr[k-1] +1;
        for(int i=st;i<=n;i++) {
            if(!isUsed[i]) {
                arr[k] = i;
                isUsed[i] = true;
                n_m_func2(k+1,bw);
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
        test.n_and_m_2_15650(br,bw);
    }
}