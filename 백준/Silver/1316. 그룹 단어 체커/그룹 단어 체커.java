import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = n;
        while(n > 0) {
            String s = br.readLine();
            int[] arr = new int[26];
            char before = s.charAt(0);
            for(int i=0; i < s.length(); i++) {
                int charNum = s.charAt(i) - 'a';
                if(arr[charNum] >= 1 && before != s.charAt(i)) {
                    num--;
                    break;
                }else {
                    before = s.charAt(i);
                    arr[charNum]++;
                }
            }
            n--;
        }
        System.out.println(num);
    }
}