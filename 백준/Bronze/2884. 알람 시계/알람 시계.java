import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        minute -= 45;
        
        if(minute < 0) {
            minute += 60;
            if(hour == 0) {
                hour = 23;
            }else {
                hour--;
            }
        }
        System.out.println(hour + " " + minute);
    }
}