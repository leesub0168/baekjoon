import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> maps = new HashMap<>();
        maps.put("A+", 4.5);
        maps.put("A0", 4.0);
        maps.put("B+", 3.5);
        maps.put("B0", 3.0);
        maps.put("C+", 2.5);
        maps.put("C0", 2.0);
        maps.put("D+", 1.5);
        maps.put("D0", 1.0);
        maps.put("F", 0.0);
        
        int n = 20;
        double sum = 0;
        double sumScore = 0;
        while(n > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double score = Double.valueOf(st.nextToken());
            String grade = st.nextToken();
            if(!grade.equals("P")) {
                sum += score;
                sumScore += (score * maps.get(grade));
            }
            n--;
        }
        System.out.println(sumScore / sum);
    }
}