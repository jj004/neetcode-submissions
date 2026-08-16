class Solution {
    public void moveZeroes(int[] nums) {
        // My Solution
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[i] == 0 && nums[j] != 0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++;
            } else if (nums[i] != 0 &&  nums[j] != 0){
                i++;
                j++;
            } else {
                j++;
            }
        }

        // Provided Solutions by NeetCode
        /*int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        }*/
    }
}