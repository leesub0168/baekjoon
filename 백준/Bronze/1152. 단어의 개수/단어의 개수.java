import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().trim().split(" ");
        int cnt = 0;
        for(int i=0;i<str.length;i++) {
            if(str[i].trim().length() >= 1) cnt++;
        }
        System.out.println(cnt);
    }
}