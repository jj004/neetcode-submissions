class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> temp = new HashMap<>();
        
        for(int i = 0; i < nums1.length; i++){
            temp.put(nums1[i][0], nums1[i][1]);
        }

        for(int i = 0; i < nums2.length; i++){
            if(temp.containsKey(nums2[i][0])){
                temp.put(nums2[i][0], temp.get(nums2[i][0]) + nums2[i][1]);
            } else{
                temp.put(nums2[i][0], nums2[i][1]);
            }
        }

        int[][] result = new int[temp.size()][2];
        int j = 0;
        for(Map.Entry<Integer, Integer> data : temp.entrySet()){
            result[j][0] = data.getKey();
            result[j][1] = data.getValue();
            j++;
        }
        return result;
    }
}
