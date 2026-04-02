class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> duplicate = new HashMap<>();
        for(int n : nums){
            if(null!=duplicate.get(n)){
                return true;
            } else{
                duplicate.put(n,1);
            }
        }
        return false;
    }
}