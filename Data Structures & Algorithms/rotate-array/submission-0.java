class Solution {
    public void rotate(int[] nums, int k) {
        int i = k;
        int j = nums.length - 1;

        while(k > 0){
            int temp = nums[i - 1];
            nums[i - 1] = nums[j];
            nums[j] = temp;

            j--;
            i--;
            k--;
        }
    }
}