class Solution {
    public int majorityElement(int[] nums) {
        // My Solution:
        /*Map<Integer, Integer> freq = new HashMap<>();

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

        return result;*/

        //Neetcode Solution 1
        /*HashMap<Integer, Integer> count = new HashMap<>();
        int res = 0, maxCount = 0;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > maxCount) {
                res = num;
                maxCount = count.get(num);
            }
        }
        return res;*/

        // Neetcode Solution 2
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}