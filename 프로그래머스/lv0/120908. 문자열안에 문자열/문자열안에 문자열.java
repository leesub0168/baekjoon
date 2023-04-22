class Solution {
    public int solution(String str1, String str2) {
        if(str1.indexOf(str2) >= 0) {
            return 1;
        }else {
            return 2;
        }
    }
}