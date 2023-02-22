import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        Collections.sort(list,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++) {
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}