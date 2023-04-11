import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        while(true) {
            s = br.readLine();
            if(s != null) {
                System.out.println(s);
            }
            else break;
        }
    }
}