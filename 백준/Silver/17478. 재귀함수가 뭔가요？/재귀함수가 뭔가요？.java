import java.util.*;
import java.io.*;

class Test {
    int cnt;
    
    public void recurs_test(BufferedReader br, BufferedWriter bw) throws IOException {
        cnt = Integer.parseInt(br.readLine());
          
        bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        
        recurs(0,bw);
        bw.flush();
        bw.close();
    }
    public void recurs(int n, BufferedWriter bw) throws IOException {
        _bar("\"재귀함수가 뭔가요?\"\n", n,bw);
        if(n == cnt) {
            _bar("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n", n,bw);
        }else {
            _bar("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",n,bw);
            _bar("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",n,bw);
            _bar("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n",n,bw);
            recurs(n+1,bw);
        }
        _bar("라고 답변하였지.\n",n,bw);
    }
    public void _bar(String str, int stk, BufferedWriter bw) throws IOException{
        for(int i=0;i<stk;i++) {
            bw.write("____");
        }
        bw.write(str);
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
        Test test = new Test();
        test.recurs_test(br,bw);
    }
}