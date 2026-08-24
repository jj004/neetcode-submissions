class Solution {
    public int pivotIndex(int[] nums) {
        int pi = 0;
        int lSum = 0;
        int rSum = 0;
        boolean flag = false;
        while(pi < nums.length){
            for(int j = 0; j < pi; j++){
                lSum += nums[j];
            }
            for(int k = pi + 1; k < nums.length; k++){
                rSum += nums[k];
            }
            if(lSum == rSum){
                return pi;
            } else{
                lSum = 0;
                rSum = 0;
                pi++;
            }
        }
        return -1;
    }
}