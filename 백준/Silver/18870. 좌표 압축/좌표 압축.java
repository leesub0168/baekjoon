import java.util.*;
import java.io.*;

class Test {
    public void solution(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] srr = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(srr[i]);
        }
        
        int[] sortArr = Arrays.copyOf(arr, n);
        Arrays.sort(sortArr);

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(i == 0 || sortArr[i-1] != sortArr[i]) list.add(sortArr[i]);
        }
        Integer[] removeDupl = list.toArray(new Integer[0]);
        /** 중복제거시 stream을 이용해서 간단하게 구현하는것도 가능. */
//        int[] removeDupl = Arrays.stream(sortArr).distinct().toArray();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            sb.append(search(removeDupl, arr[i])).append(" ");
        }
        System.out.println(sb.toString());
    }
    public int search(Integer[] arr, int target) {
        int st = 0;
        int end = arr.length -1;
        while(st <= end) {
            int mid = (st + end) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) {
                end = mid - 1;
            }else {
                st = mid + 1;
            }
        }
        return 0;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Test test = new Test();
        test.solution(br);
    }
}