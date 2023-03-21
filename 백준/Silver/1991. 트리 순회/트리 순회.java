import java.util.*;
import java.io.*;

class Test {
    int[] lc = new int[30];
    int[] rc = new int[30];
    StringBuilder sb = new StringBuilder();
    public void solution(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            char[] chars = br.readLine().toCharArray();
            int parent = chars[0] - 'A' + 1;
            int node1 = (chars[2] == '.')?0:(chars[2] - 'A' + 1);
            int node2 = (chars[4] == '.')?0:(chars[4] - 'A' + 1);
            lc[parent] = node1;
            rc[parent] = node2;
        }
        preorder(1);
        sb.append("\n");
        inOrder(1);
        sb.append("\n");
        postOrder(1);
        System.out.println(sb);
    }
    
    public void preorder(int cur) {
        sb.append(new String(Character.toChars(cur + 'A' -1)));
        if(lc[cur] != 0) preorder(lc[cur]);
        if(rc[cur] != 0) preorder(rc[cur]);
    }
    public void inOrder(int cur) {
        if(lc[cur] != 0) inOrder(lc[cur]);
        sb.append(new String(Character.toChars(cur + 'A' -1)));
        if(rc[cur] != 0) inOrder(rc[cur]);
    }
    public void postOrder(int cur) {
        if(lc[cur] != 0) postOrder(lc[cur]);
        if(rc[cur] != 0) postOrder(rc[cur]);
        sb.append(new String(Character.toChars(cur + 'A' -1)));
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Test test = new Test();
        test.solution(br);
    }
}