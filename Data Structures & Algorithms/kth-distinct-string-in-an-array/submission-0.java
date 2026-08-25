class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freq = new LinkedHashMap<>();
        String[] result = new String[k];

        for(int i = 0; i < arr.length; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int j = 0;
        for(Map.Entry<String, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1 && j < k){
                result[j] = entry.getKey();
                j++;
            }
        }
        return null != result[k - 1] ? result[k - 1] : "";
    }
}