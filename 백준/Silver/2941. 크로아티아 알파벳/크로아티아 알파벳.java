import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replaceAll("dz=","1");
        String[] arr = {
            "c=", "c-", "d-", "lj", "nj", "s=", "z="
        };
        for(int i=0; i < arr.length;i++) {
            str = str.replaceAll(arr[i],"2");
        }
        System.out.println(str.length());
    }
}