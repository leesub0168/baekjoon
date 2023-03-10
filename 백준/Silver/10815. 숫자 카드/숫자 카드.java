import java.util.*;
import java.io.*;


class Test {
    /** 이분 탐색을 이용한 경우 */
    public void solve(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] target = new int[m];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++) {
            sb.append(search(arr, Integer.parseInt(st.nextToken()))).append(" ");
        }
        System.out.println(sb);
    }

    public int search(int[] arr, int target) {
        int st = 0;
        int end = arr.length -1;
        while(st <= end) {
            int mid = (st + end) / 2;
            if(arr[mid] == target) return 1;
            else if(arr[mid] > target) {
                end = mid - 1;
            }else {
                st = mid + 1;
            }
        }
        return 0;
    }
    /** 배열을 활용한 경우 */
    public void solve_array(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int x = 10_000_000;
        int[] arr = new int[x * 2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[x + Integer.parseInt(st.nextToken())]++;
        }

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) {
            sb.append(arr[x + Integer.parseInt(st.nextToken())]).append(" ");
        }
        System.out.println(sb);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Test test = new Test();
        test.solve_array(br);
    }
}