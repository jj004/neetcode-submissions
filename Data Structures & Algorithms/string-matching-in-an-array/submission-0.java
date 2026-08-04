class Solution {
    public List<String> stringMatching(String[] words) {
        if(words.length == 1){
            return Arrays.asList(words);
        }
        Set<String> result = new TreeSet<>();

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(j != i && words[i].contains(words[j])){
                    result.add(words[j]);
                }
            }
        }

        return new ArrayList<>(result);
    }
}