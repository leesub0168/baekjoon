import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            int x = Integer.parseInt(arr[i]);
            if(max < x) max = x;
            if(min > x) min = x;
        }
        System.out.println(min + " " + max);
    }
}