import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[100002];
        Arrays.fill(arr, -1);
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(n);

        arr[n] = 0;


        while(!queue.isEmpty()) {
            int x = queue.remove();
            int[] move = {x-1,x+1,x*2};
            for(int i=0;i<3;i++) {
                int nx = move[i];

                if(nx < 0 || nx >= arr.length) continue;
                if(arr[nx] != -1) continue;
                arr[nx] = arr[x] + 1;
                queue.add(nx);
            }
        }

        bw.write(arr[k]+"");
        bw.flush();
        bw.close();
        
    }
}