class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        Set<Integer> numsSet = Arrays.stream(nums)
                             .boxed()
                             .collect(Collectors.toCollection(TreeSet::new));
        List<Integer> numsList = new ArrayList<>(numsSet);
        
        int expected = numsList.get(0);
        int longest = 0;
        int count = 0;

        for(int i = 0; i<numsList.size(); i++){
            if(numsList.get(i) == expected){
                count++;
                expected++;
            } else{
                longest = Math.max(longest, count);
                count = 1;
                expected = numsList.get(i)+1;
            }
        }
        return Math.max(longest, count);
    }
}
