class Solution {
    public int[] applyOperations(int[] nums) {
        int i =0;
        int j = 1;

        while(j < nums.length) {
            if(nums[i] == nums[j]) {
                nums[i] = nums[i] * 2;
                nums[j] = 0;
                i++;
                j++;
            } else {
                i++;
                j++;
            }
        }

        for(int k = 0; k < nums.length - 1; k++){
            if(nums[k] == 0) {
                nums[k] = nums[k + 1];
                nums[k + 1] = 0;
            }
        }
        
        return nums;
    }
}
