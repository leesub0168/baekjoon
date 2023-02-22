class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        int idx = str.indexOf(String.valueOf(k));
        return (idx == -1)?idx:idx+1;
    }
}