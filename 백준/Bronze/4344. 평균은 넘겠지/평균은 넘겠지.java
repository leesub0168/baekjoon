import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            String[] arr = br.readLine().split(" ");
            double numbers = Double.valueOf(arr[0]);
            double sum = 0;
            for(int i = 1; i < arr.length; i++) {
                sum += (Double.valueOf(arr[i]));
            }
            double average = sum / numbers;
            
            double count = 0;
            for(int i = 1; i < arr.length; i++) {
                if(Double.valueOf(arr[i]) > average) {
                    count++;
                }
            }
            
            double per = (count / numbers) * 100;
            
            sb.append(String.format("%.3f", per)).append("%\n");
            n--;
        }
        System.out.println(sb);
    }
}