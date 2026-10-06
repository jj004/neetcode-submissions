class Solution {
    public int search(int[] nums, int target) {
        int mid = nums.length / 2;
        for(int l = 0, r = nums.length - 1; l < r & r >= l; l++, r--){
            if(nums[mid] == target){
                return mid;
            } else if(target > nums[mid]){
                l = mid;
            } else{
                r = mid;
            }
        }
        return -1;
    }
}
