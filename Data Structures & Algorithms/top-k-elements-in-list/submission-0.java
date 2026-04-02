class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int n : nums){
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0)+1);
        }

        Map<Integer, Integer> sortedMap = frequencyMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1,
            LinkedHashMap::new
        ));

        int[] result = new int[k];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()){
            if(index<k){
                result[index] = entry.getKey();
                index++;
            }
        }

        return result;
    }
}
