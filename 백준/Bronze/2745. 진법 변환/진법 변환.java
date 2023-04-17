import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String number = st.nextToken();
        int type = Integer.parseInt(st.nextToken());
        int nums = number.length();
        int answer = 0;
        
        for(int i=0; i< nums; i++) {
            char c = number.charAt(i);
            if(Character.isAlphabetic(c)) {
                answer += ((c - 55) * Math.pow(type, nums - i -1));
            }else {
                answer += (Character.getNumericValue(c) * Math.pow(type, nums - i -1));
            }
        }
        System.out.println(answer);
    }
}