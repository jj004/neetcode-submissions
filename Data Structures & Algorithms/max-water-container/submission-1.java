class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int len = heights.length;
        int l = 0;
        int r = len - 1;
        while(l < r){
            int record = (r-l) * Math.min(heights[l], heights[r]);
            area = Math.max(record, area);
            if(heights[l]<=heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return area;
    }
}
