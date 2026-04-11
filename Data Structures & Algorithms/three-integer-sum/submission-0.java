class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalResult = new ArrayList<>();
        Arrays.sort(nums);

        int j = 1;
        int k = nums.length-1;
        for(int i=0; i<nums.length; i++){
            List<Integer> result = new ArrayList<>();
            while(j<nums.length && k>1){
                if(-nums[i] == nums[j]+nums[k]){
                    result.add(nums[i]);
                    result.add(nums[i]);
                }
            }
        }
    }
}
