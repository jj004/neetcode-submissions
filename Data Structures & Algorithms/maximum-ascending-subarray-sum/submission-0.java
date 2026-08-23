class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int sum = 0;
        int i = 0;
        while(i < nums.length){
            sum += nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] > nums[j-1]){
                    sum += nums[j];
                    i++;
                }else{
                    break;
                }
            }
            max = Math.max(max, sum);
            sum = 0;
            i++;
        }
        return max;
    }
}