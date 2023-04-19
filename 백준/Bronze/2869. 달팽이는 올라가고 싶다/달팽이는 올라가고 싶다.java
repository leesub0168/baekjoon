import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double up = Double.valueOf(st.nextToken());
        double down = Double.valueOf(st.nextToken());
        double goal = Double.valueOf(st.nextToken());
        
        System.out.println((int) Math.ceil((goal - down) / (up - down)));
    }
}