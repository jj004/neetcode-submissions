class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0;
        int j = 1;
        int[] result = new int[nums.length];
        
        for(int k = 0; k < nums.length; k++){
            if(nums[k] > 0){
                result[i] = nums[k];
                i += 2;
            } else{
                result[j] = nums[k];
                j += 2;
            }
        }
        
        return result;

        // My Solution
        /*int[] p = new int[nums.length/2];
        int[] n = new int[nums.length/2];
        int pi = 0;
        int ni = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                p[pi] = nums[i];
                pi++;
            } else{
                n[ni] = nums[i];
                ni++;
            }
        }

        pi = 0;
        ni = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = p[pi];
                pi++;
            } else{
                nums[i] = n[ni];
                ni++;
            }
        }

        return nums;*/
    }
}