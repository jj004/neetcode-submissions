class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[temperatures.length];
        result[len - 1] = 0;

        for(int i = len - 2; i >= 0; i--){
            boolean flag = false;
            int j = i + 1;
            while(j < len){
                if(temperatures[i] < temperatures[j]){
                    flag = true;
                    break;
                }
                j++;
            }
            result[i] = flag ? j - i : 0;
        }

        return result;
    }
}
