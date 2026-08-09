class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(freq.containsKey(s.charAt(i))){
                freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);
            } else{
                freq.put(s.charAt(i), 1);
            }
        }

        int maxEven = Integer.MIN_VALUE;
        int maxOdd = Integer.MIN_VALUE;

        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            if(entry.getValue() % 2 == 0 && maxEven < entry.getValue()){
                maxEven = entry.getValue();
            }

            if(entry.getValue() % 2 != 0 && maxOdd < entry.getValue()){
                maxOdd = entry.getValue();
            }
        }

        return maxOdd - maxEven;
    }
}