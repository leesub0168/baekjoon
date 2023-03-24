import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        boolean[] arr = new boolean[35];
        for(int i = 0; i < reserve.length; i++) {
            int idx = Arrays.binarySearch(lost,reserve[i]);
            if(idx < 0) {
                arr[reserve[i]] = true;
            }else {
                lost[idx] = -1;
            }
        }
        for(int i = 0; i < lost.length; i++) {
            if(lost[i] < 0) continue;
            if(arr[lost[i]]) {
                arr[lost[i]] = false;
                continue;
            }
            if(arr[lost[i] - 1]) {
                arr[lost[i] - 1] = false;
                continue;
            }
            if(arr[lost[i] + 1]) {
                arr[lost[i] + 1] = false;
                continue;
            }
            n--;
        }
        
        
        return n;
    }
}