class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> temp = new TreeMap<>();

        for(int i = 0; i < nums1.length; i++){
            temp.put(nums1[i][0], nums1[i][1]);
        }

        for(int j = 0; j < nums2.length; j++){
            if(temp.containsKey(nums2[j][0])){
                temp.put(nums2[j][0], temp.get(nums2[j][0]) + nums2[j][1]);
            } else{
                temp.put(nums2[j][0], nums2[j][1]);
            }
        }

        int[][] result = new int[temp.size()][2];
        int k = 0;
        for(Map.Entry<Integer, Integer> data : temp.entrySet()){
            result[k][0] = data.getKey();
            result[k][1] = data.getValue();
            k++;
        }
        return result;
    }
}
