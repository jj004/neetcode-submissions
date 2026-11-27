class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;

        if(len == 1){
            return true;
        }

        int cnt = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] > nums[(i+1) % len] && ++cnt > 1){
                return false;
            }
        }

        return true;
    }
}