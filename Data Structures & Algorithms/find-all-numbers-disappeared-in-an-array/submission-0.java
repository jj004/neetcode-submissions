class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> no = Arrays.stream(nums).boxed().toList();
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i <= nums.length; i++){
            if(!no.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}