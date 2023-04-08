import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for(int i = 0; i < chars.length; i++) {
            if(arr[chars[i]-'a'] == -1) arr[chars[i]-'a'] = i;
        }
        StringBuilder sb = new StringBuilder();
        for(char c = 'a'; c <= 'z'; c++) {
            sb.append(arr[c-'a']).append(" ");
        }
        System.out.println(sb);
    }
}