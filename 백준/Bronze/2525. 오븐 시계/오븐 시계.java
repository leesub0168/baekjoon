import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        int time = Integer.parseInt(br.readLine());
        
        minute += (time);
        
        if(minute >= 60) {
            hour += (minute / 60);
            minute = (minute % 60);
        } 
        if(hour >= 24) {
            hour -= 24;
        }
        System.out.println(hour + " " + minute);
    }
}