class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[--n];
            } else {
                i++;
            }
        }
        return n;
        // My Solution =>
        /*List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                result.add(nums[i]);
            }
        }
        for(int i = 0; i < result.size(); i++){
            nums[i] = result.get(i);
        }
        return result.size();*/
    }
}