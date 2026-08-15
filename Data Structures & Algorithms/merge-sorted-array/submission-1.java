class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        for(int i = 0; i < n; i++){
            int last = nums1[len - 1];
            for(int j = len - 1; j > 0; j--){
                nums1[j] = nums1[j - 1];
            }
            nums1[0] = last;
        }

        for(int i = 0; i < nums2.length; i++){
            nums1[i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}