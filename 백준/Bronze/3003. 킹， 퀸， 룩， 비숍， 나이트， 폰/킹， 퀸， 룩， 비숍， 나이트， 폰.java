import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {1, 1, 2, 2, 2, 8};
        String[] str = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 6; i++) {
            int x = Integer.parseInt(str[i]);
            sb.append(arr[i] - x).append(" ");
        }
        System.out.println(sb);
    }
}