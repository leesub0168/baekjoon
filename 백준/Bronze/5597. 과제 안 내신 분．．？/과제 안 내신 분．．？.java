import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[32];
        for(int i = 1; i <= 28; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[x] = true;
        }
        
        for(int i=1;i<=30;i++) {
            if(!arr[i]) System.out.println(i);
        }
    }
}