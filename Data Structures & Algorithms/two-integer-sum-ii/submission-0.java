class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int len = numbers.length;
        int sum = 0;
        int i = 0;
        int j = len - 1;
        while(i<len && j>0){
            sum = numbers[i] + numbers[j];
            if(sum == target){
                result[0] = numbers[i];
                result[1] = numbers[j];
                break;
            } else if(sum > target){
                j--;
            } else{
                i++;
            }
        }
        return result;
    }
}
