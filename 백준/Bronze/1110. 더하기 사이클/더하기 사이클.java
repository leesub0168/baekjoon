import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String org = br.readLine();
        if(org.length() == 1) org = "0" + org;
        String newNum = "";
        int num = 0;
        while(!org.equals(newNum)) {
            if(newNum.equals("")) newNum = org;
            if(newNum.length() == 1) newNum = "0" + newNum;
            StringBuilder sb = new StringBuilder();
            String[] arr = newNum.split("");
            sb.append(arr[1]);
            int x = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            if(x < 10) {
                sb.append(x);
            }else {
                sb.append(String.valueOf(x).substring(1));
            }

            newNum = sb.toString();
            num++;
        }
        System.out.println(num);
    }
}