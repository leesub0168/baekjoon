import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] chars = new char[5][15];
        for(int i = 0; i < 5; i++) {
            Arrays.fill(chars[i], '*');
            char[] strToChars = br.readLine().toCharArray();
            for(int j = 0; j < strToChars.length; j++) {
                chars[i][j] = strToChars[j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(chars[j][i] != '*') sb.append(chars[j][i]);
            }
        }
        System.out.println(sb);
    }
}