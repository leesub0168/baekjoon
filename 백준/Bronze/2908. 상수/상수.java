import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(st.nextToken());
        int x = Integer.parseInt(sb.reverse().toString());
        sb = new StringBuilder(st.nextToken());
        int y = Integer.parseInt(sb.reverse().toString());
        if(x > y) {
            System.out.println(x);
        }else {
            System.out.println(y);
        }
    }
}