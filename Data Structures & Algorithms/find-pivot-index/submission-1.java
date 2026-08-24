class Solution {
    public int pivotIndex(int[] nums) {
        int pi = 0;
        while(pi < nums.length){
            int lSum = 0;
            int rSum = 0;
            for(int j = 0; j < pi; j++){
                lSum += nums[j];
            }
            for(int k = pi + 1; k < nums.length; k++){
                rSum += nums[k];
            }
            if(lSum == rSum){
                return pi;
            } else{
                pi++;
            }
        }
        return -1;
    }
}