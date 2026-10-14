class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> lib = new ArrayList<>();
        for(char ch : magazine.toCharArray()){
            lib.add(ch);
        }

        for(char c : ransomNote.toCharArray()){
            if(!lib.contains(c)){
                return false;
            }
            lib.remove((Character) c);
        }

        return true;
    }
    /*public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> lib = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            lib.put(ch, lib.getOrDefault(ch, 0) + 1);
        }

        for(char c : ransomNote.toCharArray()){
            if(null == lib.get(c) || lib.get(c) <= 0){
                return false;
            } else {
                lib.put(c, lib.get(c) - 1);
            }
        }

        return true;
    }*/
}