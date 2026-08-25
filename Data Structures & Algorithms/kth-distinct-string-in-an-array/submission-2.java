class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> distinct = new HashSet<>();
        Set<String> seen = new HashSet<>();

        for (String s : arr) {
            if (distinct.contains(s)) {
                distinct.remove(s);
                seen.add(s);
            } else if (!seen.contains(s)) {
                distinct.add(s);
            }
        }

        for (String s : arr) {
            if (distinct.contains(s)) {
                k--;
                if (k == 0) {
                    return s;
                }
            }
        }

        return "";
        /*Map<String, Integer> count = new HashMap<>();

        for (String s : arr) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }

        for (String s : arr) {
            if (count.get(s) == 1) {
                k--;
                if (k == 0) {
                    return s;
                }
            }
        }

        return "";*/
        // My Solution
        /*Map<String, Integer> freq = new LinkedHashMap<>();
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
        return null != result[k - 1] ? result[k - 1] : "";*/
    }
}