class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> target = new HashMap<>();

        for(char c : text.toCharArray()){
            if("balon".indexOf(c) != -1){
                target.put(c, target.getOrDefault(c, 0) + 1);
            }
        }

        if(target.size() < 5){
            return 0;
        }

        target.put('l', target.get('l')/2);
        target.put('o', target.get('o')/2);
        return Collections.min(target.values());

        /*Map<Character, Integer> textCount = new HashMap<>();

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

        return result;*/
    }
}