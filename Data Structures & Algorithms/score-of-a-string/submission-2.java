class Solution {
    int sum = 0;
    public int scoreOfString(String s) {
        for(int i=0; i < s.length()-1; i++){
            sum += Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return sum;
    }
}