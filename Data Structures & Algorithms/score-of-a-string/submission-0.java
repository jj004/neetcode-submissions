class Solution {
    int sum = 0;
    public int scoreOfString(String s) {
        for(int i=0; i < s.length()-1; i++){
            int val1 = s.charAt(i);
            int val2 = s.charAt(i+1);
            if(val1>val2){
                sum += val1-val2;
            } else {
                sum += val2-val1;
            }
        }
        return sum;
    }
}