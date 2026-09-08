class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increase = true, decrease = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (!(nums[i] <= nums[i + 1])) {
                increase = false;
            }
            if (!(nums[i] >= nums[i + 1])) {
                decrease = false;
            }
        }
        return increase || decrease;

        // My Solution
        /*int[] no = nums.clone();

        Arrays.sort(no);
        if(Arrays.equals(no, nums)){
            return true;
        } else{
            no = Arrays.stream(no)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
            return Arrays.equals(no, nums);
        }*/
    }
}