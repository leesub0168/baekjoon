import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for(int i=1;i<=count;i++) {
            bw.write(" ".repeat(count-i));
            bw.write("*".repeat(2 * (i) -1));
            bw.write("\n");
        }
        for(int i=1;i<count;i++) {
            bw.write(" ".repeat(i));
            bw.write("*".repeat(2 * (count - i) -1));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}