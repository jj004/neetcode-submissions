class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int[] result = new int[heights.length];
        Stack<Integer> st = new Stack<>();

        for(int i = heights.length - 1; i >= 0; i--){
            int count = 0;
            while(!st.isEmpty() && heights[i] > heights[st.peek()]){
                count++;
                st.pop();
            }
            result[i] = st.isEmpty() ? count : count + 1;
            st.push(i);
        }

        return result;
    }
}