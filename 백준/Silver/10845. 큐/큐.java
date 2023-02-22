import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] dat = new int[100001];
        Arrays.fill(dat,-1);
        int head = 0, tail = 0;
        int n = Integer.parseInt(br.readLine());

        while(n > 0) {
            n--;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String m = st.nextToken();
            if(m.equals("push")) {
                dat[tail++] = Integer.parseInt(st.nextToken());
            }else if(m.equals("front")) {
                if(tail-head == 0) {
                    bw.write("-1\n");
                }else {
                    bw.write(dat[head]+"\n");
                }
            }else if(m.equals("back")) {
                if(tail-head == 0) {
                    bw.write("-1\n");
                }else {
                    bw.write(dat[tail-1]+"\n");
                }
            }else if(m.equals("size")) {
                bw.write((tail-head) + "\n");
            }else if(m.equals("empty")) {
                if(tail-head == 0) {
                    bw.write("1\n");
                }else {
                    bw.write("0\n");
                }
            }else { // pop
                if(tail-head == 0) {
                    bw.write("-1\n");
                }else {
                    bw.write(dat[head] + "\n");
                    head++;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}