import java.util.*;
import java.io.*;

class Test {
    int n, m;
    int[] arr = new int[10];
    StringBuilder sb = new StringBuilder();
    public void n_and_m(BufferedReader br) throws IOException {
        String[] sArr = br.readLine().split(" ");
        n = Integer.parseInt(sArr[0]);
        m = Integer.parseInt(sArr[1]);
        
        recurse(0);
        
        System.out.println(sb.toString());
    }
    
    public void recurse(int k){
        if(k == m) {
            for(int i=0;i<m;i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1;i<=n;i++) {
            arr[k] = i;
            recurse(k+1);
        }
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Test test = new Test();
        test.n_and_m(br);
    }
}