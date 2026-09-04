class Solution {
    public boolean isArraySpecial(int[] nums) {
        // Neetcode Solution 1 : Bitwise Comparison
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i - 1] & 1) == (nums[i] & 1)) {
                return false;
            }
        }
        return true;

        // Neetcode Solution 2 : Modulo Comparison
        /*for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] % 2 == nums[i] % 2) {
                return false;
            }
        }
        return true;*/
        // My Solution
        /*if(nums.length == 1){
            return true;
        }
        boolean flag = false;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] % 2 == 0 && nums[i + 1] % 2 !=0){
                flag = true;
            } else if(nums[i] % 2 != 0 && nums[i + 1] % 2 ==0){
                flag = true;
            } else {
                flag = false;
                break;
            }
        }

        return flag;*/
    }
}