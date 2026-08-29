class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> textCount = new HashMap<>();

        for(char c : text.toCharArray()){
            textCount.put(c, textCount.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> targetCount = new HashMap<>();

        for(char c : "balloon".toCharArray()){
            targetCount.put(c, targetCount.getOrDefault(c, 0) + 1);
        }

        int result = text.length();
        for(char c : targetCount.keySet()){
            result = Math.min(result, textCount.getOrDefault(c, 0)/targetCount.get(c));
        }

        return result;
    }
}