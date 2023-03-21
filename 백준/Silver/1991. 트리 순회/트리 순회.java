import java.util.*;
import java.io.*;

class Test {
    char[] lc = new char[30];
    char[] rc = new char[30];
    StringBuilder sb = new StringBuilder();
    public void solution(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            char[] chars = br.readLine().toCharArray();
            int parent = chars[0] - 'A';
            lc[parent] = chars[2];
            rc[parent] = chars[4];
        }
        preorder('A');
        sb.append("\n");
        inOrder('A');
        sb.append("\n");
        postOrder('A');
        System.out.println(sb);
    }
    
    public void preorder(char cur) {
        sb.append(cur);
        if(lc[cur-'A'] != '.') preorder(lc[cur-'A']);
        if(rc[cur-'A'] != '.') preorder(rc[cur-'A']);
    }
    public void inOrder(char cur) {
        if(lc[cur-'A'] != '.') inOrder(lc[cur-'A']);
        sb.append(cur);
        if(rc[cur-'A'] != '.') inOrder(rc[cur-'A']);
    }
    public void postOrder(char cur) {
        if(lc[cur-'A'] != '.') postOrder(lc[cur-'A']);
        if(rc[cur-'A'] != '.') postOrder(rc[cur-'A']);
        sb.append(cur);
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Test test = new Test();
        test.solution(br);
    }
}