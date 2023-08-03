import java.util.*;

class Solution {
    public int solution(int n) {
        double d = (double) n;
        double sqrt = Math.sqrt(d);
        
        if(d % sqrt == 0) return 1;
        else return 2;
    }
}