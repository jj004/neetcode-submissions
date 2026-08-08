class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(freq.get(nums[i])!=null){
                freq.put(nums[i], freq.get(nums[i])+1);
            } else {
                freq.put(nums[i], 1);
            }
        }

        int result = 0;
        for(Map.Entry<Integer, Integer> data : freq.entrySet()){
            if(data.getValue() > (nums.length/2)){
                result = data.getKey();
                break;
            }
        }

        return result;
    }
}