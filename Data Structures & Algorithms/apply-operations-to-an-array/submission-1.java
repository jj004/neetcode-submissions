class Solution {
    public int[] applyOperations(int[] nums) {
        int i = 0;
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

        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        }
        
        return nums;
    }
}
