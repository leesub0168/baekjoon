import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int tc = Integer.parseInt(br.readLine());
        while(tc > 0) {
            LinkedList<Character> list = new LinkedList<>();
            char[] c = br.readLine().toCharArray();
            ListIterator<Character> iterator = (ListIterator<Character>) list.iterator();
            for(int i=0;i<c.length;i++) {
                switch (c[i]) {
                    case '<':
                        if (iterator.hasPrevious()) iterator.previous();
                        break;
                    case '>':
                        if(iterator.hasNext()) iterator.next();
                        break;
                    case '-':
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                            iterator.remove();
                        }
                        break;
                    default:
                        iterator.add(c[i]);
                        break;
                }
            }
            for(char tmp : list) {
                bw.write(tmp);
            }
            bw.write("\n");
            tc--;
        }
        bw.flush();
        bw.close();
        
    }
}