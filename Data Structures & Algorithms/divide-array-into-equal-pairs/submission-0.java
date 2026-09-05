class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 != 0){
            return false;
        }

        Map<Integer, Integer> data = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            data.put(nums[i], data.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : data.entrySet()){
            if(entry.getValue() % 2 != 0){
                return false;
            }
        }

        return true;
    }
}