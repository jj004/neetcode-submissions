class Solution {
    public boolean isMonotonic(int[] nums) {
        int[] no = nums.clone();

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
        }
    }
}