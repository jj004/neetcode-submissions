class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> data = new TreeSet<>();

        for(int i = 0; i < nums.length; i++){
            data.add(nums[i]);
        }

        List<Integer> result = new ArrayList<>(data);
        for(int i = 0; i < result.size(); i++){
            nums[i] = result.get(i);
        }

        return data.size();
    }
}