class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;

        if(len == 1){
            return true;
        }

        int cnt = 0;

        for(int i = 1; i < 2*len; i++){
            if(nums[i % len] >= nums[(i - 1) % len]){
                cnt++;
            } else{
                cnt = 1;
            }
            if(cnt == len){
                return true;
            }
        }

        return false;

        /*for(int i = 0; i < len; i++){
            if(nums[i] > nums[(i+1) % len] && ++cnt > 1){
                return false;
            }
        }

        return true;*/
    }
}