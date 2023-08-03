class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        my_string = my_string.toLowerCase();
        
        int[] arr = new int[200];
        for(char c : my_string.toCharArray()) {
            arr[c]++;
        }
        
        for(int i=0; i< arr.length; i++) {
            while(arr[i] > 0) {
                arr[i]--;
                sb.append(Character.toChars(i));
            }
        }
        
        return sb.toString();
    }
}