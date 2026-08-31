class Solution {
    public int findLucky(int[] arr) {
        int max = -1;

        Map<Integer, Integer> data = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            data.put(arr[i], data.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : data.entrySet()){
            if(entry.getKey() == entry.getValue()){
                max = max < entry.getKey() ? entry.getKey() : max;
            }
        }

        return max;
    }
}