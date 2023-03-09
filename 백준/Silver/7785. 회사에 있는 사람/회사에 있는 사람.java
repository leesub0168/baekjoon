import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> hashMap = new LinkedHashMap<>();
        for(int i=0;i<n;i++) {
            String[] srr = br.readLine().split(" ");
            hashMap.put(srr[0], srr[1]);
        }

        List<String> list = new ArrayList<>();
        for (String str : hashMap.keySet()) {
            if(hashMap.get(str).equals("enter")) list.add(str);
        }

        Collections.sort(list, Collections.reverseOrder());
        for(String s : list) {
            System.out.println(s);
        }
    }
}