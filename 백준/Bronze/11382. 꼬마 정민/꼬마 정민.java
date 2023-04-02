import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = Long.valueOf(st.nextToken());
        sum += Long.valueOf(st.nextToken());
        sum += Long.valueOf(st.nextToken());
        System.out.println(sum);
    }
}