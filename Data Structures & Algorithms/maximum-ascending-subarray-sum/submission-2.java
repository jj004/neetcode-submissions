class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                sum = 0;
            }
            sum += nums[i];
            max = Math.max(max, sum);
        }

        return max;

        /*int max = 0;
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
        return max;*/
    }
}