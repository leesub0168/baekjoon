class Solution {
    public int solution(int n, int t) {
        return recurse(n,t);
    }
    public int recurse(int n, int m) {
        if(m == 1) return n * 2;
        m--;
        return recurse(n, m) * 2;
    }
}