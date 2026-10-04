class Solution {
    /*public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int index = 0;
        for(int i=0; i<2; i++){
            for(int j=0; j<nums.length; j++){
                ans[index] = nums[j];
                index++;
            }
        }
        return ans;
    }*/

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }
}