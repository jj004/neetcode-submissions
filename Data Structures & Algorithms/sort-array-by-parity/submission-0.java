class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = 0;

        while(i < nums.length){
            if(nums[i] % 2 == 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
            i++;
        }
        return nums;
    }
}