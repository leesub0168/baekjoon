import java.util.*;
import java.io.*;

class Pair {
    Integer key;
    Integer value;

    public Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }
    public Integer getValue() {
        return value;
    }
}

class Test0117 {
    public void tower_2493(BufferedReader br, BufferedWriter bw) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Pair> tower = new Stack<>();

        tower.push(new Pair(100000001,0));
        for(int i=1;i<=n;i++) {
            int heg = Integer.parseInt(st.nextToken());
            while (tower.peek().getKey() < heg) {
                tower.pop();
            }
            bw.write(tower.peek().getValue() + " ");
            tower.push(new Pair(heg,i));
        }

        bw.flush();
        bw.close();
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        Test0117 test0117 = new Test0117();
        test0117.tower_2493(br,bw);
    }
}