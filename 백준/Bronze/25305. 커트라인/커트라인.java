import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String[] arr = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.get(k-1));
    }
}