import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeSet<String> set = new TreeSet<>();
        for(int i=0;i<n;i++) {
            String[] srr = br.readLine().split(" ");
            String name = srr[0];
            String status = srr[1];
            if(status.equals("enter")) set.add(name);
            else set.remove(name);
        }

        Iterator<String> iterator = set.descendingIterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            sb.append(iterator.next()).append("\n");
        }
        System.out.println(sb.toString());
    }
}