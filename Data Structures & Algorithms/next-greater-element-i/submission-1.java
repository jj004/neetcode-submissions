class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        /*List<Integer> n1List = Arrays.stream(nums1)
                                .boxed()
                                .collect(Collectors.toCollection(ArrayList::new));
        List<Integer> n2List = Arrays.stream(nums2)
                                .boxed()
                                .collect(Collectors.toCollection(ArrayList::new));
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n1List.size(); i++){
            int n2Index = n2List.indexOf(n1List.get(i));
            if(n2List.contains(n1List.get(i)) && (n2Index + 1) <= n2List.size() - 1){
                if(n2List.get(n2Index + 1) > n1List.get(i)){
                    result.add(n2List.get(n2Index + 1));
                } else{
                    result.add(-1);    
                }
            } else{
                result.add(-1);
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();*/

        int n = nums2.length;
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int nextGreater = -1;
            for (int j = n - 1; j >= 0; j--) {
                if (nums2[j] > nums1[i]) {
                    nextGreater = nums2[j];
                } else if (nums2[j] == nums1[i]) {
                    break;
                }
            }
            res[i] = nextGreater;
        }
        return res;
    }
}