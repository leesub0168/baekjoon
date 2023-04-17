import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        int type = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            int base = number % type;
            if(base >= 10) sb.append((char) (base + 55));
            else sb.append(base);
            number /= type;
        }
        sb.reverse();

        System.out.println(sb);
    }
}