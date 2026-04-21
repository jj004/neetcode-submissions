class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int l = 0;
        int r = heights.length - 1;
        while(l < r){
            int leftHeight = heights[l];
            int rightHeight = heights[r];

            int record = (r-l) * Math.min(leftHeight, rightHeight);
            area = Math.max(record, area);
            if(leftHeight<=rightHeight){
                while (l < r && heights[l] <= leftHeight) {
                    l++;
                }
            } else {
                while (l < r && heights[r] <= rightHeight) {
                    r--;
                }
            }
        }
        return area;
    }
}
