import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            t--;
            String s = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arrStr = br.readLine();
            ArrayDeque<Integer> list = new ArrayDeque<>();
            if(n > 0) {
                StringTokenizer st = new StringTokenizer(arrStr.substring(1,arrStr.length()-1),",");
                for(int i=0;i<n;i++) {
                    list.add(Integer.parseInt(st.nextToken()));
                }
            }
            boolean flag = false;
            boolean reverse = false;
            for (int i=0;i<s.length();i++) {
                if(s.charAt(i) == 'R') {
                    reverse = !reverse;
                }else {
                    if(list.isEmpty()) {
                        flag = true;
                        break;
                    }else  {
                        if(reverse) list.removeLast();
                        else list.removeFirst();
                    }
                }
            }
            if(!flag) {
                bw.write("[");
                StringBuffer sb = new StringBuffer();
                Iterator<Integer> iterator = (reverse)? list.descendingIterator():list.iterator();
                while(iterator.hasNext()) {
                    sb.append(iterator.next() + ",");
                }
                if(sb.length() > 0) bw.write(sb.substring(0, sb.length() -1));
                bw.write("]\n");
            }else {
                bw.write("error\n");
            }

        }
        bw.flush();
        bw.close();
    }
}