import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=1;i<=20;i++) {
            arrayList.add(i);
        }
        try {
            for(int x=1;x<=10;x++) {
                String txt = br.readLine();
                String[] txtArr = txt.split(" ");
                int str = Integer.parseInt(txtArr[0]), end = Integer.parseInt(txtArr[1]);
                for(int i=0;i<(end-str+1)/2;i++) {
                    Collections.swap(arrayList, str+i-1, end-i-1);
                }
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringBuffer sb = new StringBuffer();
            for(Integer x : arrayList) {
                sb.append(x +" ");
            }
            bw.write(sb.toString());
            
            
            bw.flush();
            bw.close();

        }catch (Exception e) {
        }
    }
}