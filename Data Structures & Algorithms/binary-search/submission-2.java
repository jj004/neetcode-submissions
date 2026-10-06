class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    private int binarySearch(int l, int r, int[] nums, int target){
        if(l > r){
            return -1;
        }
        int mid = (l + r) / 2;
        if(nums[mid] == target){
            return mid;
        } else if(nums[mid] < target){
            return binarySearch(mid + 1, r, nums, target);
        } else {
            return binarySearch(l, mid - 1, nums, target);
        }
    }

    /*public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(target > nums[mid]){
                l = mid;
                l++;
            } else{
                r = mid;
                r--;
            }
        }
        return -1;
    }*/
}
