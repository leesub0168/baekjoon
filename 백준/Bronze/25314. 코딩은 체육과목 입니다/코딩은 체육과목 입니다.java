import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String str = "long ";
        StringBuilder sb = new StringBuilder();
        sb.append(str.repeat(n/4));
        sb.append("int");
        
        System.out.println(sb);
        
    }
}