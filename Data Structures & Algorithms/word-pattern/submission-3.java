class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sWords = s.split(" ");
        if(pattern.length() != sWords.length){
            return false;
        }

        Map<Character, String> mapping = new HashMap<>();
        boolean result = true;

        for(int i = 0; i < pattern.length(); i++){
            if(mapping.get(pattern.charAt(i)) == null && !mapping.containsValue(sWords[i])){
                mapping.put(pattern.charAt(i),  sWords[i]);
            } else{
                if(null == mapping.get(pattern.charAt(i)) || !mapping.get(pattern.charAt(i)).equals(sWords[i])){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}