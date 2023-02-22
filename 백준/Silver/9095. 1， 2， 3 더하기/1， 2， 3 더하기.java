import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int x = Integer.parseInt(br.readLine());
            int[] dim = new int[12];
            dim[1] = 1;
            dim[2] = 2;
            dim[3] = 4;
            
            for(int j=4;j<=x;j++) {
                dim[j] = dim[j-1] + dim[j-2] + dim[j-3];
            }
            System.out.println(dim[x]);
        }
    }
}