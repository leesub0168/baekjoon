import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[100];
        for(char c = 'A'; c <= 'Z'; c++) {
            int num = 0;
            if(c <= 'C') {
                num = 3;
            }else if(c <= 'F') {
                num = 4;
            }else if(c <= 'I') {
                num = 5;
            }else if(c <= 'L') {
                num = 6;
            }else if(c <= 'O') {
                num = 7;
            }else if(c <= 'S') {
                num = 8;
            }else if(c <= 'V') {
                num = 9;
            }else if(c <= 'Z') {
                num = 10;
            }
            arr[c-'A'] = num;
        }
        String str = br.readLine();
        int sum = 0;
        for(int i=0; i < str.length(); i++) {
            sum += arr[str.charAt(i) - 'A'];
        }
        System.out.println(sum);
    }
}