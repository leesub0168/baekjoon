import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int idx = -1;
        for(int i=0;i<9;i++) {
            int x = Integer.parseInt(br.readLine());
            if(x > max) {
                max = x;
                idx = i+1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}