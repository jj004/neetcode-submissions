class Solution {
    public int countCharacters(String[] words, String chars) {

        Map<Character, Integer> data = new HashMap<>();
        for(int i = 0; i < chars.length(); i++){
            data.put(chars.charAt(i), data.getOrDefault(chars.charAt(i), 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        for(String s : words){
            boolean flag = false;
            Map<Character, Integer> lib = new HashMap<>(data);
            for(char ch : s.toCharArray()){
                if(null != lib.get(ch) && lib.get(ch) > 0){
                    lib.put(ch, lib.get(ch) - 1);
                    flag = true;
                } else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                sb.append(s);
            }
        }

        return sb.toString().length();
    }
}